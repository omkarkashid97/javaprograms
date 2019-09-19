package Functional;
import java.util.Scanner;

import Utility.Utility;

public class HarmonicNumber
{
	public static void main(String args[])
	{
		System.out.println("Enter the value of n to print harmonic number : ");
		Scanner scan=new Scanner(System.in);
		double n=scan.nextInt();
		
		Utility utility=new Utility();
		utility.harmonic(n);
		
		scan.close();
	}
}