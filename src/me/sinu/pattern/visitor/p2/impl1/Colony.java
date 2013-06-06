package me.sinu.pattern.visitor.p2.impl1;

import java.util.ArrayList;
import java.util.List;

import me.sinu.pattern.visitor.p2.interfaces.Visitable;
import me.sinu.pattern.visitor.p2.interfaces.Visitor;

/**
 * Collection of Houses and other Colonies.
 * Decides where the Visitor to go next
 * @author sinu_john
 * www.sinujohn.wordpress.com
 *
 */
public class Colony implements Visitable {

	private String name;
	private List<House> houses;
	private List<Colony> colonies;
	
	public Colony(String name) {
		this.name = name;
		houses = new ArrayList<House>();
		colonies = new ArrayList<Colony>();
	}
	
	public String getName() {
		return name;
	}

	public List<House> getHouses() {
		return houses;
	}

	public List<Colony> getColonies() {
		return colonies;
	}
	
	public void addHouse(House house) {
		houses.add(house);
	}
	
	public void addColony(Colony colony) {
		colonies.add(colony);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		for(House house : houses) {
			house.accept(visitor);
		}
		for(Colony colony : colonies) {
			colony.accept(visitor);
		}
	}

}
