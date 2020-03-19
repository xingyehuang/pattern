package cn.xyh.pattern.structure.templateMethod;

public abstract class AbstractTemplate {
	public void templateMethod() {
		concreteMethod();
		abstractMethod();
		doMethod();
	}
	protected final void concreteMethod() {
		System.out.println("具体方法");
	}
	protected abstract void abstractMethod();
	protected void doMethod() {
		System.out.println("钩子方法");
	}
}
