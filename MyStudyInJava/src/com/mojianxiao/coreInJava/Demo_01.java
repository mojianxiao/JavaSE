package com.mojianxiao.coreInJava;
//基本数据类型值传递 不改变原始值
public class Demo_01 {
	public static void add(int x) {
		x=x*10;
	}
	public static void main(String[] args) {
		int x = 1;
		add(x);
		System.out.println(x);
	}
}
