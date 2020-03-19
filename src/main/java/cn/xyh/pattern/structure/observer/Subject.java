package cn.xyh.pattern.structure.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> list = new ArrayList<>();
	
	public void add(Observer observer) {
		list.add(observer);
	}
	
	public void remove(Observer observer) {
		list.remove(observer);
	}
	
	public void notifyObserver(String state) {
		for(Observer observer : list) {
			observer.update(state);
		}
	}
	
}

