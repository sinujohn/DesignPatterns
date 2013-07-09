package me.sinu.pattern.observer.p1.impl;

import me.sinu.pattern.observer.p1.interfaces.Observable;
import me.sinu.pattern.observer.p1.interfaces.Observer;

/**
 * 
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class FloodHandler implements Observer {

	@Override
	public void update(Observable c) {
		if(((City)c).getEventNo() == 3) {
			System.out.println("Flood in City: " + c + " : Tadaa.. flood is under control");
		}
	}

}
