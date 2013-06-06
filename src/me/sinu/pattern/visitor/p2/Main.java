package me.sinu.pattern.visitor.p2;

import me.sinu.pattern.visitor.p2.impl1.Colony;
import me.sinu.pattern.visitor.p2.impl1.House;
import me.sinu.pattern.visitor.p2.impl1.PrintVisitor;
import me.sinu.pattern.visitor.p2.interfaces.Visitor;

/**
 * Visitor Design Pattern
 * Visitable decides where to go
 * @author www.sinujohn.wordpress.com
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Colony bigColony = new Colony("MotherColony");
		Colony colony1 = new Colony("Smaller Colony1");
		Colony colony2 = new Colony("Smaller Colony2");
		Colony colony3 = new Colony("Smaller Colony3");
		
		bigColony.addColony(colony1);
		bigColony.addColony(colony2);
		colony1.addColony(colony3);
		
		bigColony.addHouse(new House("King's Palace"));
		bigColony.addHouse(new House("Queen's Palace"));
		bigColony.addHouse(new House("Minister's Palace"));
		bigColony.addHouse(new House("Amphitheatre"));
		
		colony1.addHouse(new House("House1[Colony1]"));
		colony1.addHouse(new House("House2[Colony1]"));
		colony1.addHouse(new House("House3[Colony1]"));
		
		colony2.addHouse(new House("House1[Colony2]"));
		colony2.addHouse(new House("House2[Colony2]"));
		colony2.addHouse(new House("House3[Colony2]"));
		colony2.addHouse(new House("House4[Colony2]"));
		
		colony3.addHouse(new House("House1[Colony3]"));
		colony3.addHouse(new House("House2[Colony3]"));

		System.out.println("Visitable decides where to go");
		Visitor printVisitor = new PrintVisitor();
		bigColony.accept(printVisitor);
	}

}
