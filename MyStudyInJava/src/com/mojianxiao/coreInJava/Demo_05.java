package com.mojianxiao.coreInJava;
//使用BigDecimal获取精度更高的数
import java.math.BigDecimal;

public class Demo_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.0;
		double i = 4.1;
		i =  (a / i);
		String s = String.valueOf(i);
		BigDecimal bigDecimal = new BigDecimal(s);
		System.out.println(bigDecimal);
	}

}
