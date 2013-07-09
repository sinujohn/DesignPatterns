package me.sinu.pattern.observer.p1;

import java.util.Random;

import me.sinu.pattern.observer.p1.impl.AmbulanceHandler;
import me.sinu.pattern.observer.p1.impl.City;
import me.sinu.pattern.observer.p1.impl.FireHandler;
import me.sinu.pattern.observer.p1.impl.FloodHandler;
import me.sinu.pattern.observer.p1.impl.TheftHandler;

/**
 * City is the Observable. Handlers are Observers.
 * When somethingHappens in a city, the city notifies all the observers
 * 
 * @author sinu
 * www.sinujohn.wordpress.com
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		City c = new City("Kochi");
		c.addHandler(new AmbulanceHandler());
		c.addHandler(new FireHandler());
		c.addHandler(new FloodHandler());
		c.addHandler(new TheftHandler());
		
		c.somethingHappens(new Random().nextInt()%5);
		System.out.println("City dwellers are now happy");
	}

}
