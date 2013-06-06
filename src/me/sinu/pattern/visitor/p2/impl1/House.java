package me.sinu.pattern.visitor.p2.impl1;

import me.sinu.pattern.visitor.p2.interfaces.Visitable;
import me.sinu.pattern.visitor.p2.interfaces.Visitor;

/**
 * Represents the basic element of the Colony
 * @author sinu_john
 * www.sinujohn.wordpress.com
 *
 */
public class House implements Visitable {

	private String name;
	
	public House(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}

}
