package Static;

public class TestA
{
public static void main(String args[])
{
	A a=new A();
	a.eid=8;
	a.salary=4000;
	a.ceo="Mahesh";
	
	A a1=new A();
	a1.eid=10;
	a1.salary=5000;
	a1.ceo="Rajesh";
	
	a.m1();
	a1.m1();
	
}
}
