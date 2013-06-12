package me.sinu.pattern.singleton.p3;

/**
 * Thread safe Singleton. Implements double-check locking 
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class Singleton {

	//note the use of volatile keyword
	private volatile static Singleton instance;
	
	//prevent creating objects outside this class
	private Singleton() {
		System.out.println("Creating Singleton");
	}
	
	//double-check locking with synchronization
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();		
				}
			}
		}
		return instance;
	}
	
	public void doStuff() {
		System.out.println("Singleton : doStuff()");
	}
}
