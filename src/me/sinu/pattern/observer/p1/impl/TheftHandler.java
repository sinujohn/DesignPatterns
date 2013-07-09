package me.sinu.pattern.observer.p1.impl;

import me.sinu.pattern.observer.p1.interfaces.Observable;
import me.sinu.pattern.observer.p1.interfaces.Observer;

/**
 * 
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public class TheftHandler implements Observer {

	@Override
	public void update(Observable c) {
		if(((City)c).getEventNo() == 4) {
			System.out.println("Police in City: " + c + " : We are investigating the case");
		}
	}

}
