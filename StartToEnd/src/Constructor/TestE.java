package Constructor;

public class TestE 
{
public static void main(String [] args)
{
	Employe e1=new Employe(1,"abc",4f);
	Employe e2=new Employe(2,"pqr",9.3f);
	Employe e3=new Employe(4,"abc",5.0f);
	
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.salary);
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.salary);
	System.out.println(e3.id);
	System.out.println(e3.name);
	System.out.println(e3.salary);
}
}
