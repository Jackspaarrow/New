package com.recurion.project;

public class Constucter1 
{
	Constucter1()
	{
		System.out.println("hello");
	}
	Constucter1(int a)
	{
		System.out.println(a);
	}
	Constucter1(String string) 
	{
		System.out.println(string);
	}
	public static void main(String[] args) 
	{
		Constucter1 a = new Constucter1();
		Constucter1 b = new Constucter1(10);
		Constucter1 c = new Constucter1("java");
	}

}
