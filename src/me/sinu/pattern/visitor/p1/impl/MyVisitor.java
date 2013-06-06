package me.sinu.pattern.visitor.p1.impl;

import me.sinu.pattern.visitor.p1.interfaces.Visitor;

/**
 * The Visitor. It just visits.
 * Doesn't decide where to go next
 * @author sinu_john
 * www.sinujohn.wordpress.com
 *
 */
public class MyVisitor implements Visitor {

	
	@Override
	public void visit(Element element) {
		System.out.println("Visiting Element : " + element.getName());
	}

	@Override
	public void visit(ElementCollection col) {
		System.out.println("Visiting ElementCollection : " + col.getName());
	}

}
