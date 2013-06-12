package me.sinu.pattern.singleton.p1;

/**
 * Example of a Simple Singleton without thread synchronization
  * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton.getInstance().doStuff();
		Singleton.getInstance().doStuff();
		Singleton.getInstance().doStuff();
		Singleton.getInstance().doStuff();
		Singleton.getInstance().doStuff();
	}

}
