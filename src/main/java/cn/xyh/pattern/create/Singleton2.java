package cn.xyh.pattern.create;

/**
 * 	单例模式-饿汉式
 * */
public class Singleton2 {
	private static final Singleton2 singleton = new Singleton2();
	
	// 私有构造器
	private Singleton2() {
		
	}
	public static Singleton2 getSingleton2() {
		return singleton;
	}
}
