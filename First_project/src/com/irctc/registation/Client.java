package com.irctc.registation;
//abstract class constructor
public abstract class Client {
	public Client()
	{
		System.out.println("thid is default constructor");//default constructor
	}
	
	public Client(int a)
	{
		this();
		System.out.println("thid is one parameter constructor");
	}
	public abstract void data();
	public void demo()
	{
		System.out.println("hello this is method");
	}
	
}
