package org.remoteme.clientTest.fakeDevices;

public class Configuration {
	public static final boolean dev=true;
	public static boolean isDev(){
		return  dev;
	}

	public static int getPingDelay(){
		if (dev){
			return 250;
		}else{
			return 24000;
		}
	}

	public static int getPingTimeOut(){
		if (dev){
			return 1000;
		}else{
			return 120000;
		}
	}
}
