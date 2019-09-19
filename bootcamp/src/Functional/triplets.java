package Functional;

import java.util.Scanner;

public class triplets 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);		
		System.out.println("Enter the number of elements in array : ");
		int n=scan.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("Enter the elements in array : ");
		for (int i = 0; i < n; i++) 
		{
			a[i]=scan.nextInt();
		}
		
		int count=0;
		for (int i = 0; i < n-2; i++) 
		{
			for (int j = i+1; j < n-1; j++) 
			{
				for (int j2 = j+1; j2 < n; j2++) 
				{
					if(a[i]+a[j]+a[j2]==0)
					{
						count++;
						System.out.print(" "+a[i]+" "+a[j]+" "+a[j2]);
						System.out.println();
					}
				}
			}
		}
		System.out.println("Number of total triplets are : "+count);
		
		scan.close();
	}

}
