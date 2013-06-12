package me.sinu.pattern.singleton.p3;

/**
 * Calls the Thread safe Singleton
 * @author Sinu John
 * www.sinujohn.wordpress.com
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Singleton with synchronisation. ");
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
