package me.sinu.pattern.visitor.p1.impl;

import me.sinu.pattern.visitor.p1.interfaces.Visitable;
import me.sinu.pattern.visitor.p1.interfaces.Visitor;

/**
 * Represents a single Element which is Visitable
 * @author sinu_john
 * www.sinujohn.wordpress.com
 *
 */
public class Element implements Visitable {

	String name;
	
	
	public String getName() {
		return name;
	}

	public Element(String name) {
		this.name = name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
