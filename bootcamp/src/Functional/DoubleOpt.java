package Functional;
import java.util.Scanner;

import Utility.Utility;

public class DoubleOpt
{
  public static void main(String args[])
  {
	  double a,b,c;
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("enter value of a : ");
	  a =scanner.nextDouble();
	  System.out.println("enter value of b : ");
	  b =scanner.nextDouble();
	  System.out.println("enter value of c : ");
	  c =scanner.nextDouble();
	  
	 Utility utility=new Utility();
	 utility.opD(a, b, c);
	 
	 scanner.close();
  }
}