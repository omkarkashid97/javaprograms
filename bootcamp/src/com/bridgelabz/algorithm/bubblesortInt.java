package com.bridgelabz.algorithm;

import java.util.Scanner;

public class bubblesortInt 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=scan.nextInt();
		
		int a[]=new int[n],i;
		System.out.println("Enter elements in array : ");

		for ( i = 0; i < n; i++) 		
			 a[i]=scan.nextInt();	
		Utility.bubblesortInt(a);
		for ( i = 0; i < a.length; i++)
		{
			System.out.println(" "+a[i]);
		}
	
		scan.close();
	}

}
