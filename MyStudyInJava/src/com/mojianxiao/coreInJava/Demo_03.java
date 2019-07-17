package com.mojianxiao.coreInJava;
//初始化顺序
public class Demo_03 {
	private static int i;
	//初始化代码块
	{
		i=4;
		System.err.println(i);
	}
	//静态代码块
	static {
		i=3;
		System.err.println(i);
	}
	public Demo_03() {
		i = 8;
		System.err.println("构造代码:"+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_03 d = new Demo_03();
	}

}
