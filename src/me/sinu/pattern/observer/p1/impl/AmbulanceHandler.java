package me.sinu.pattern.observer.p1.impl;

import me.sinu.pattern.observer.p1.interfaces.Observable;
import me.sinu.pattern.observer.p1.interfaces.Observer;

/**
 * 
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class AmbulanceHandler implements Observer {

	@Override
	public void update(Observable c) {
		if(((City)c).getEventNo() == 1 || ((City)c).getEventNo() == 2 || ((City)c).getEventNo() == 3) {
			System.out.println("Ambulance going to City: " + c + " : Oye people, lets go to the hospital!");
		}
	}

}
