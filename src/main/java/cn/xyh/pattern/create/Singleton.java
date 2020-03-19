package cn.xyh.pattern.create;

/**
 * 	单例模式-懒汉式
 * */
public class Singleton {
	private static Singleton singleton = null;
	
	// 私有构造器
	private Singleton() {
		
	}
	// 在多线程环境下，singleton是线程不安全的
	public static Singleton getSingleton() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	// synchronized关键字来避免线程安全问题，不过synchronized对方法加锁，性能低
	public static synchronized Singleton getSingleton2() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	// synchronized 对Singleton加锁，提高效率
	public static Singleton getSingleton3() {
		if(singleton == null) {
			synchronized (singleton) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
