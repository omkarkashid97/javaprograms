package com.bridgelabz.logical;
import java.lang.Math;
import java.util.Scanner;

public class Trig
{
	public static void main(String args[])
	{
		double d;
		System.out.println("\nEnter angle in degrees : ");
		Scanner scan=new Scanner(System.in);
		d=scan.nextDouble();
		
		double r=Math.toRadians(d);
		
		System.out.print("\nSin : "+Math.sin(r)+"\nCos : "+Math.cos(r)+"\nTan : "+Math.tan(r));
		scan.close();
	}
}