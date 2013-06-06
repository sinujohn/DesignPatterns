package me.sinu.pattern.visitor.p1.impl;


import java.util.ArrayList;
import java.util.List;

import me.sinu.pattern.visitor.p1.interfaces.Visitable;
import me.sinu.pattern.visitor.p1.interfaces.Visitor;

/**
 * Represents a collection of Elements. The collection is Visitable
 * @author sinu_john
 * www.sinujohn.wordpress.com
 *
 */
public class ElementCollection implements Visitable{

	private String name;
	private List<Element> list;
	
	
	public String getName() {
		return name;
	}

	public List<Element> getList() {
		return list;
	}

	public ElementCollection(String name) {
		this.name = name;
		list = new ArrayList<>();
	}
	
	public void add(Element element1) {
		list.add(element1);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
		for(Element e : this.list) {
			e.accept(visitor);
		}
		
	}
	
	
}
