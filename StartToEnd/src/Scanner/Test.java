package Scanner;

import java.util.*;

public class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner c=new Scanner();		
		System.out.println("----Select----\n"
		        +"1.Addition \n"
				+"2.Subtraction");
		while(true);
		{
			System.out.println("Enter first number");
			int ch =sc.nextInt();
			if(ch==1)
				c.Addition(10,29);
			else if(ch==2)
			    c.Subtraction(50.78);
			else
				System.out.println("Enter second number");
		}
	
	}
}
