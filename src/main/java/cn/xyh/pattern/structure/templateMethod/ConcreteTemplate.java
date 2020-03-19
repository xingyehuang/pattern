package cn.xyh.pattern.structure.templateMethod;

public class ConcreteTemplate extends AbstractTemplate{

	@Override
	protected void abstractMethod() {
		System.out.println("abstractMethod");
	}
	
	@Override
	protected void doMethod() {
		System.out.println("钩子方法加个日志");
		super.doMethod();
	}
	
	public static void main(String[] args) {
		ConcreteTemplate template = new ConcreteTemplate();
		template.templateMethod();
	}

}
