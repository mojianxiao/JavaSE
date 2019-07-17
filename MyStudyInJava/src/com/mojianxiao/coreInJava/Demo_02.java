package com.mojianxiao.coreInJava;
//按引用传递 改变结果
public class Demo_02 {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Demo_02(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public static void editName(Demo_02 d) {
		d.setName("小明");
	}
	public static void main(String[] args) {
		Demo_02 d =new Demo_02(1,"小红");
		editName(d);
		System.err.println(d.getName());
	}
}
