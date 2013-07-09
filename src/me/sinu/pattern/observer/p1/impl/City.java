package me.sinu.pattern.observer.p1.impl;

import java.util.ArrayList;
import java.util.List;

import me.sinu.pattern.observer.p1.interfaces.Observable;
import me.sinu.pattern.observer.p1.interfaces.Observer;

/**
 * 
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class City implements Observable{

	public List<Observer> handlers = new ArrayList<Observer>();
	private int eventNo; 
	public String name;
	
	public City(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public void addHandler(Observer o) {
		handlers.add(o);
	}

	public void removeHandler(Observer o) {
		handlers.remove(o);
	}

	public void notifyObservers() {
		for(Observer o : handlers) {
			o.update(this);
		}
	}
	
	public void somethingHappens(int i) {
		this.eventNo = i;
		notifyObservers();
	}
	
	public int getEventNo() {
		return eventNo;
	}
	
}
