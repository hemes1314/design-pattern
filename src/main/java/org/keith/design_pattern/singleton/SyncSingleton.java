package org.keith.design_pattern.singleton;

public class SyncSingleton {
	private static SyncSingleton instance;  
    private final static Object syncLock = new Object();  
     
    private SyncSingleton() {  
         
    }  
     
    public static SyncSingleton getInstance(){  
        if (instance == null) {  
            synchronized (syncLock) {  
                if (instance == null) {  
                    instance = new SyncSingleton();  
                }  
            }  
        }  
         
        return instance;  
    }  
}
