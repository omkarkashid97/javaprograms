package Functional;

import java.util.Scanner;

public class Array2D 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int m=scan.nextInt();
		System.out.println("Enter the number of cols : ");
		int n=scan.nextInt();
		
		 int s[][]=new int[m][n];
		
		int i,j;
		
		for ( i = 0; i < m; i++) 
		{
			for ( j = 0; j < n; j++) 
			{
				s[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("2D array : ");
		

		for ( i = 0; i < m; i++) 
		{
			for ( j = 0; j < n; j++) 
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}

		scan.close();
	}

}
