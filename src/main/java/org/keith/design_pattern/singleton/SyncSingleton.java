package org.keith.design_pattern.singleton;

public class SyncSingleton {
	private volatile static SyncSingleton instance;  
     
    private SyncSingleton() {  
         
    }  
     
    public static SyncSingleton getInstance(){  
        if (instance == null) {  
            synchronized (SyncSingleton.class) {  
                if (instance == null) {  
                    instance = new SyncSingleton();  
                }  
            }  
        }  
         
        return instance;  
    }  
    
    /**
	 * synchronized同步块处括号中的锁定对象采用的是一个无关的Object类实例。将它作为锁而不是通常synchronized所用的this，
	 * 其原因是getInstance方法是一个静态方法，在它的内部不能使用未静态的或者未实例化的类对象（避免空指针异常），，除了还方法之外可以使用类名.
	 * class的方法来获得该类的字节码对象作为同步锁，就是Singleton.class,该方法比rivate final static Object
	 * syncLock = new
	 * Object()更好。同时也没有直接使用instance作为锁定的对象，是因为加锁之时，instance可能还没实例化（同样是为了避免空指针异常）
	 * 。每次进行进入同步代码块之前都要对同步锁进行判断，这样效率大大降低，在同步代码块的外面首先使用 if (instance ==
	 * null)进行判断，在进入 synchronized
	 * (syncLock)进行判断这样可以提高效率，比如第一次线程1创建好了instance对象，当其他线程进入的时候instance已经存在，
	 * 就不会再执行synchronized
	 * (syncLock)，不会对同步进行判断，大大提高了效率。下面这种方法，就算创建好了instance对象，但是其他线程每次来都会判断同步锁，
	 * 降低了效率。
	 */
}
