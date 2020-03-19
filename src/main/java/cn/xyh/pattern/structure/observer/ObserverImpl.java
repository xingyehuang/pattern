package cn.xyh.pattern.structure.observer;

public class ObserverImpl implements Observer{

	@Override
	public void update(String state) {
		System.out.println(this+"收到通知，状态发送变化="+state);
	}

}
