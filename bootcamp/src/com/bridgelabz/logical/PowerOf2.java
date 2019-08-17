package com.bridgelabz.logical;

import java.util.Scanner;

public class PowerOf2
{
	public static void main(String args[])
	{
		System.out.println("\nEnter the value of n");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(" "+Math.pow(2,i));
		}
		
		scanner.close();
	}
}