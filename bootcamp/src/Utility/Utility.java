package Utility;
import java.lang.Math;

import Utility.Utility;

public class Utility
{
	public void opI(int a,int b,int c)
	{
		int op1,op2,op3,op4;
	  op1=a+b*c;
	  System.out.println("a+b*c : "+op1);
	  op2=a*b+c;
	  System.out.println("a*b+c : "+op2);
	  op3=c+a/b;
	  System.out.println("c+a/b : "+op3);
	  op4=a%b+c;
	  System.out.println("a%b+c : "+op4);
	}
	
	public void opD(double a,double b,double c)
	{
		
		 double op1,op2,op3,op4; 
		 op1=a+b*c;
		  System.out.println("a+b*c : "+op1);
		  op2=a*b+c;
		  System.out.println("a*b+c : "+op2);
		  op3=c+a/b;
		  System.out.println("c+a/b : "+op3);
		  op4=a%b+c;
		  System.out.println("a%b+c : "+op4);
	}
	
	public static void distance(double x,double y)
	{
		double a=Math.pow(x,2);
		double b=Math.pow(y,2);
		double c=a+b;

	    System.out.println("Euclidean dtstance : "+c);
	}
	
	public void root(int a,int b,int c)
	{
		double d=b*b-4*a*c;
		double r1=(-b+Math.sqrt(d))/(2*a);
		double r2=(-b-Math.sqrt(d))/(2*a);
        
	    System.out.print("two roots : root1="+r1+"  root2"+r2);
	}
	
	public void harmonic(double n)
	{
	  double sum=0;
	
	  for(int i=1;i<=n;i++)
	  {
		sum+=(double)1/i;
	  }
	  System.out.println("nth harmonic number is : "+sum);
	}
}
