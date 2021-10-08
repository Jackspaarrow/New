package com.recurion.project;
public class ConstucterCallCon 
{
	public ConstucterCallCon(int i) 
	{
		this();
		call();
		System.out.println(i);
	}
	public ConstucterCallCon()
	{
		System.out.println("call to call constucter");
	}
	private void call() 
	{
		System.out.println("first");
	}
	public static void main(String[] args) 
	{
		ConstucterCallCon c = new ConstucterCallCon(7);
		ConstucterCallCon a = new ConstucterCallCon();
	}
}
