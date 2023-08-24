package Mainmethod;

public class Calci
{
public void Addition()
{
	System.out.println("Addition="+(2+3));
}
public void Subtraction()
{
	System.out.println("Subtraction="+(50-10));
}
public void Multiplication() 
{
	System.out.println("Multiplication="+(45*12));
}
public void Division()
{
	System.out.println("Division="+(67/4));
}
public static void main (String args[])
{
Calci c=new Calci();
c.Addition();
c.Subtraction();
c.Multiplication();
c.Division();	
}
}