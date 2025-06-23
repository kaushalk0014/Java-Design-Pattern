package com.learning.singleton.design.pattern;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton firsIntance=Singleton.getInstance();
		
		Singleton secIntance=Singleton.getInstance();
		
		System.out.println(firsIntance.hashCode()== secIntance.hashCode());
		
	}
}
