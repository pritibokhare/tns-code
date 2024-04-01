package com.irctc.registation;

public class Child extends Client {
	public Child()
	{
		super(10);
		System.out.println("child class constructor");
	}
public void data()
{
	super.demo();
	System.out.println("Client class method");
}
}
