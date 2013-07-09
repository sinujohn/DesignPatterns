package me.sinu.pattern.observer.p1.impl;

import me.sinu.pattern.observer.p1.interfaces.Observable;
import me.sinu.pattern.observer.p1.interfaces.Observer;

/**
 * 
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class FireHandler implements Observer {

	@Override
	public void update(Observable c) {
		if(((City)c).getEventNo() == 2) {
			System.out.println("Fire in City: " + c + " : ohh.. its a small fire! Don't be alarmed. I will kill it fast");
		}
	}

}
