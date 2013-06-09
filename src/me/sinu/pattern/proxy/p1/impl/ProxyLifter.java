package me.sinu.pattern.proxy.p1.impl;

import me.sinu.pattern.proxy.p1.interfaces.Lifter;

public class ProxyLifter implements Lifter {

	private int cost = 0;
	private HeavyLifter lifter;
	
	@Override
	public void doSomeHeavyLifting() {
		if(lifter == null) {
			lifter = new HeavyLifter();
		}
		lifter.doSomeHeavyLifting();
		cost = lifter.getCost();
	}

	@Override
	public int getCost() {
		return cost;
	}

}
