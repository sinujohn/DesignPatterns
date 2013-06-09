package me.sinu.pattern.proxy.p1;

import me.sinu.pattern.proxy.p1.impl.HeavyLifter;
import me.sinu.pattern.proxy.p1.impl.ProxyLifter;
import me.sinu.pattern.proxy.p1.interfaces.Lifter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Without using Proxy. Creating 3 objects and invoking one doSomeHeavyLifting()");
		Lifter lifter1 = new HeavyLifter();
		Lifter lifter2 = new HeavyLifter();
		Lifter lifter3 = new HeavyLifter();
		lifter2.doSomeHeavyLifting();
		System.out.println("Total cost : " + (lifter1.getCost() + lifter2.getCost() + lifter3.getCost()));
		
		System.out.println("\nUsing Proxy. Creating 3 objects and invoking one doSomeHeavyLifting()");
		lifter1 = new ProxyLifter();
		lifter2 = new ProxyLifter();
		lifter3 = new ProxyLifter();
		lifter2.doSomeHeavyLifting();
		System.out.println("Total cost : " + (lifter1.getCost() + lifter2.getCost() + lifter3.getCost()));
		
		System.out.println("\nLook how much you saved by using a proxy");

	}

}
