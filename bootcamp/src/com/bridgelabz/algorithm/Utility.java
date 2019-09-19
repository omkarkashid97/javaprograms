package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Utility 
{
	public static int[] bubblesortInt(int a[])
	{ 
		int temp;
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}					
			}
		}
		return a;
		
	}
	
	public static String[] bubblesortString(String[] s1)
	{
		String temp;
		for (int i = 0; i < s1.length-1; i++) 
		{
			for (int j = 0; j < s1.length-i-1; j++) 
			{
				if(s1[j].compareTo(s1[j+1])>0)
				{
					temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
		return s1;
	}

	public static void binarysearchInt(int[] a,int key)
	{
		bubblesortInt(a);
		int n=a.length;
		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			if(a[mid]<key)
			low=mid+1;
			else if(a[mid]==key)
			{
				System.out.println(key+" element found at location : "+(mid+1));
				break;
			}
			else			
				high=mid-1;
			
				mid=(low+high)/2;
				
		}
		if(low>high)
			System.out.println(key+" Element not found");
	}
	
	public static void binarysearchString(String s,String key)
	{

		String s1[]=s.split(" ");
		int n=s1.length;
		bubblesortString(s1);

		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		
		
		while(low<=high)
		{
			if(s1[mid].compareTo(key)>0)
			low=mid+1;
			else if(s1[mid].equals(key))
			{
				System.out.println(key+" element found at location : "+(mid+1));
				break;
			}
			else			
				high=mid-1;
			
				mid=(low+high)/2;
				
		}
		if(low>high)
			System.out.println(key+" Element not found");
	}

	



}
