package me.sinu.pattern.visitor.p2.impl1;

import me.sinu.pattern.visitor.p2.interfaces.Visitable;
import me.sinu.pattern.visitor.p2.interfaces.Visitor;

public class PrintVisitor implements Visitor{

	@Override
	public void visit(Visitable visitable) {
		
		if(visitable instanceof House) {
			House house = (House) visitable;
			this.visitHouse(house);
		} else if(visitable instanceof Colony) {
			Colony colony = (Colony) visitable;
			visitColony(colony);
		} 
	}

	private void visitHouse(House house) {
		System.out.println("Visited House : " + house.getName());
	}
	
	private void visitColony(Colony colony) {
		System.out.println("Visited colony : " + colony.getName());
	}
}
