package Mainmethod;

public class Objectcalling 
{
public void m1()
{
	System.out.println("m1 of A");
}
public void m2()
{
	System.out.println("m2 of A");
}
public void m3()
{
	System.out.println("m3 of A");
}
public static void main(String args[])
{
	System.out.println("main method start");
	Objectcalling oc=new Objectcalling();
	oc.m1();
	oc.m2();
	oc.m3();
	System.out.println("main method end");
	
}
}
