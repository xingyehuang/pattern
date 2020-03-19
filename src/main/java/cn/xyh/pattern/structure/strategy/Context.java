package cn.xyh.pattern.structure.strategy;

public class Context {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doOperate() {
		strategy.operate();
	}
	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new ConcreteStrategyA());
		context.doOperate();
		context.setStrategy(new ConcreteStrategyB());
		context.doOperate();
		context.setStrategy(new ConcreteStrategyC());
		context.doOperate();
	}
}
