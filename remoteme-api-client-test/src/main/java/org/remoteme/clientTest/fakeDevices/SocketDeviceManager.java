package org.remoteme.clientTest.fakeDevices;




import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public  class SocketDeviceManager  {

	public static final SocketDeviceManager thiz= new SocketDeviceManager();

	final Thread thread;
	final ConcurrentLinkedQueue<SocketDevice>  cd;

	public static SocketDeviceManager get() {
		return thiz;
	}

	private SocketDeviceManager()  {
		cd = new ConcurrentLinkedQueue<>();
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				long lastPingSend = System.currentTimeMillis();
				while (!Thread.interrupted()) {
					Iterator<SocketDevice> iterator = cd.iterator();
					while(iterator.hasNext()){
						try {
							iterator.next().checkAndRead();
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

					if (System.currentTimeMillis()>lastPingSend+25*1000){
						lastPingSend=System.currentTimeMillis();
						System.out.println("sending ping");
						cd.forEach(x->x.sendPing());
					}
				}
			}
		});

		thread.start();

	}


	public void addSocket(SocketDevice toAdd){
		cd.add(toAdd);
	}
	public void removeSocket(SocketDevice toRemove){
		cd.remove(toRemove);
	}

}
