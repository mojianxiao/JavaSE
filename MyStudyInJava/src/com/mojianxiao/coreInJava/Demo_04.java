package com.mojianxiao.coreInJava;

public class Demo_04 extends Demo_03{
	private static int i;
	
	{
		i=5;
		System.err.println("这是子类的初始化代码:"+i);
	}
	static {
		i=6;
		System.err.println("这是子类的静态代码:"+i);
	}
	public Demo_04() {
		super();
		i = 9;
		System.err.println("构造代码:"+i);
	}
	public static void main(String[] args) {
		Demo_04 d = new Demo_04();
	}
}
