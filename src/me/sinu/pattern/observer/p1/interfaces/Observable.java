package me.sinu.pattern.observer.p1.interfaces;

/**
 * The Observable interface
 * @author Sinu John
 * www.sinujohn.wordpress.com
 *
 */
public interface Observable {

	void addHandler(Observer o);
	void removeHandler(Observer o);
	void notifyObservers();
}
