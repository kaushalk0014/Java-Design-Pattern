package com.learning.singleton.design.pattern;

public class Singleton {
	
	private Singleton () {
		System.out.println("Singleton instance created");
	}
	
	private static class Holder{
		private static final Singleton INSTANCE = new Singleton ();
	}
	
	public static Singleton getInstance() {
		return Holder.INSTANCE;
	}
}
