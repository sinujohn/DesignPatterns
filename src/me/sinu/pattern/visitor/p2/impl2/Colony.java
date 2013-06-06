package me.sinu.pattern.visitor.p2.impl2;

import java.util.ArrayList;
import java.util.List;

import me.sinu.pattern.visitor.p2.impl1.House;
import me.sinu.pattern.visitor.p2.interfaces.Visitable;
import me.sinu.pattern.visitor.p2.interfaces.Visitor;

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
	}

}
