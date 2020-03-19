package cn.xyh.pattern.structure.observer;

public class ConcreteSubject extends Subject{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("subject 状态改变");
		notifyObserver(state);
	}
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		for(int i=0;i<10;i++) {
			Observer observerA = new ObserverImpl();
			subject.add(observerA);
		}
		
		subject.setState("state");
	}
}
