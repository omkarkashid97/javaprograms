package Functional;
import java.util.Scanner;

import Utility.Utility;

public class Distance
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);

	    System.out.print("Enter values for calculating euclidean distance : ");
	    System.out.print("\nEnter value of x : ");
		double x=scanner.nextInt();
	    System.out.print("Enter value of y : ");
		double y=scanner.nextInt();
		
       
       Utility.distance(x,y);
       

        
        scanner.close();

	}

}
