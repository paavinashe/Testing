package javaBasics;

public class StaticKeyword {
	static int a=10;
	int b=20;
	static void m1() 
	{
		System.out.println("I am Static method");
	}
	void m2() 
	{
		System.out.println("I am non static method");
	}
	void m3() 
	{
		System.out.println(a);
		m1();
		System.out.println(b);
		m2();
	}
	public static void main(String args[]) 
	{
		System.out.println(a);
		m1();
		 StaticKeyword sk = new StaticKeyword();
		 System.out.println(sk.b);
		 sk.m2();
		
	}

}
