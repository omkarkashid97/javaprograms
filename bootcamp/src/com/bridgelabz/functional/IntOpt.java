package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;


public class IntOpt
{
  public static void main(String args[])
  {
	  int a,b,c;
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("enter value of a : ");
	  a=scanner.nextInt();
	  System.out.println("enter value of b : ");
	  b=scanner.nextInt();
	  System.out.println("enter value of c : ");
	  c=scanner.nextInt();
	  
	  Utility utility=new Utility();
	  utility.opI(a, b, c);
	  
	  scanner.close();
  }

} 