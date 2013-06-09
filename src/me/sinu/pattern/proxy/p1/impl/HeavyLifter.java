package me.sinu.pattern.proxy.p1.impl;

import me.sinu.pattern.proxy.p1.interfaces.Lifter;

public class HeavyLifter implements Lifter {

	int cost = 0;
	
	public HeavyLifter() {
		System.out.println("You just created a Heavy Lifter. You are gonna pay heavily!");
		cost += 500;
	}
	
	@Override
	public void doSomeHeavyLifting() {
		System.out.println("HeavyLifter in action. It'll cost you heavily");
		cost += 100;
	}

	@Override
	public int getCost() {
		return cost;
	}

}
