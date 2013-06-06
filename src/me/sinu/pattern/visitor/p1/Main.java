package me.sinu.pattern.visitor.p1;

import me.sinu.pattern.visitor.p1.impl.Element;
import me.sinu.pattern.visitor.p1.impl.ElementCollection;
import me.sinu.pattern.visitor.p1.impl.MyVisitor;
import me.sinu.pattern.visitor.p1.interfaces.Visitor;

/**
 * Visitor Design Pattern
 * Visitable decides where visitor will go
 * @author www.sinujohn.wordpress.com
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create the collection
		ElementCollection col = new ElementCollection("AncientElements");
		col.add(new Element("prithvi"));
		col.add(new Element("jala"));
		col.add(new Element("akasha"));
		col.add(new Element("agni"));
		col.add(new Element("vayu"));
		
		//visit each
		Visitor visitor = new MyVisitor();
		col.accept(visitor);
	}

}
