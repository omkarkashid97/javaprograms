package com.bridgelabz.algorithm;

import java.util.Scanner;

public class bubblesortString 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the string : ");
		String s=scan.nextLine();
		String s1[]=s.split(" ");
		Utility.bubblesortString(s1);
		
		for (int i = 0; i < s1.length; i++)
		{
			System.out.println(" "+s1[i]);
		}

		scan.close();

	}

}
