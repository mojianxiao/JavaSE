package com.mojianxiao.abstractDemo;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Person p = new Student();
		p.show();
		Student s = new Student("1");
		Student st = new Student("2");
		Student stu = st;
		System.err.println(s==st);
		System.err.println(s.equals(st));
		System.err.println(st==stu);
		System.err.println(st.equals(stu));
		Class cl = Class.forName(p.getClass().getName());
		System.err.println(cl);
	}

}
