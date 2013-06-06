package me.sinu.pattern.visitor.p2.impl2;

import me.sinu.pattern.visitor.p2.impl1.House;
import me.sinu.pattern.visitor.p2.interfaces.Visitable;
import me.sinu.pattern.visitor.p2.interfaces.Visitor;

public class XMLVisitor implements Visitor{

	StringBuffer xml = new StringBuffer();
	
	public String getXML() {
		return "<xml>" + xml + "\n</xml>";
	}
	
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
		xml.append("\n<house name=\"" + house.getName() + "\"/>");
	}
	
	private void visitColony(Colony colony) {
		xml.append("\n<colony name=\"" + colony.getName() + "\">");
		for(House h : colony.getHouses()) {
			this.visit(h);
		}
		for(Colony c : colony.getColonies()) {
			this.visit(c);
		}
		xml.append("\n</colony>");
	}
}
