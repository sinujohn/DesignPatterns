package me.sinu.pattern.singleton.p2;

import me.sinu.pattern.singleton.p1.Singleton;

/**
 * Shows that Singleton without thread safety might not behave as Singleton in multithreaded environments.<br>
 * One of the possible outputs:
 * <pre>Creating Singleton
Creating Singleton
Singleton : doStuff()
Singleton : doStuff()
Creating Singleton
Singleton : doStuff()
Singleton : doStuff()
Singleton : doStuff()</pre>
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class Main {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Where Simple Singleton without synchronisation fails. Run multiple times and we can see that Singleton is created multiple times");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				Singleton.getInstance().doStuff();				
			}
		};
		
		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();		
	}

}
