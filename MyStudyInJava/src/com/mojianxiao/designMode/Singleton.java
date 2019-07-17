package com.mojianxiao.designMode;
/** 
 * 使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。
 * 私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
 * 多个线程同时进入	if(singleton == null)，将会导致多次实例化singletion引发线程不安全
 * */
public class Singleton {
//懒汉模式(线程不安全 )
	private static Singleton singleton;
	private Singleton() {}
	public static Singleton getSingleton() {
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
//饿汉式(线程安全)
		private static Singleton singleton2 = new Singleton();
//懒汉式-线程安全
		
}
