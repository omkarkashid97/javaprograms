package Functional;
import java.util.Scanner;

import Utility.Utility;


public class Quadratic
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
	    System.out.print("Enter value of a : ");
		a=scanner.nextInt();
	    System.out.print("Enter value of b : ");
		b=scanner.nextInt();
	    System.out.print("Enter value of c : ");
		c=scanner.nextInt();

		 
		  Utility utility=new Utility();
		  utility.root(a, b, c);
		  
		  scanner.close();

	}
	
}
