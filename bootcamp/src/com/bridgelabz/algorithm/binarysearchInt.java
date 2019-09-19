package com.bridgelabz.algorithm;

import java.util.Scanner;

public class binarysearchInt
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the element u want to search : ");
		int key=scan.nextInt();
		int []a= {1,3,5,4,2,7,9,0,7,10};
		
		Utility.binarysearchInt(a,key);
		scan.close();

	}

}
