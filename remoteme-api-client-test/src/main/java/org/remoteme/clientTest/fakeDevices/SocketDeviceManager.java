package org.remoteme.clientTest.fakeDevices;




import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public  class SocketDeviceManager  {

	public static final SocketDeviceManager thiz= new SocketDeviceManager();

	final Thread thread;
	final ConcurrentLinkedQueue<MockDevice>  cd;

	boolean pingOn=true;

	public static SocketDeviceManager get() {
		return thiz;
	}

	public void setPing(boolean pingOn) {
		this.pingOn = pingOn;
	}

	private SocketDeviceManager()  {
		cd = new ConcurrentLinkedQueue<>();
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				long lastPingSend = System.currentTimeMillis();
				while (!Thread.interrupted()) {
					Iterator<MockDevice> iterator = cd.iterator();
					while(iterator.hasNext()){
						try {

							MockDevice next = iterator.next();
							if (next instanceof SocketDevice) {
								((SocketDevice) next).checkAndRead();
							}

						}catch (Exception ex){
							System.out.println("error while reading message");
							iterator.remove();
						}
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					if (pingOn){
						if (System.currentTimeMillis()>lastPingSend+Configuration.getPingDelay()){
							lastPingSend=System.currentTimeMillis();
							iterator = new ArrayList(cd).iterator();
							while (iterator.hasNext()){
								MockDevice next = iterator.next();
								try {
									next.sendPing();
									System.out.println("ping");

								}catch (Exception ex){
									System.out.println("device ping fail");
									try {
										next.disconnect();
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
							}
							cd.forEach(x->x.sendPing());
						}
					}

				}
			}
		});

		thread.start();

	}


	public void addSocket(MockDevice toAdd){
		cd.add(toAdd);
	}
	public void removeSocket(MockDevice toRemove){
		cd.remove(toRemove);
	}

}
