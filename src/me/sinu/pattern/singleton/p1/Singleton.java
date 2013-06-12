package me.sinu.pattern.singleton.p1;

/**
 * Simple Singleton without thread safety
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class Singleton {

	private static Singleton instance;
	
	//prevent creating objects outside this class
	private Singleton() {
		System.out.println("Creating Singleton");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void doStuff() {
		System.out.println("Singleton : doStuff()");
	}
}
