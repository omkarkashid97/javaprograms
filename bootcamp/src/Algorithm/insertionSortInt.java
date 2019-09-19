package Algorithm;

import java.util.Scanner;

public class insertionSortInt 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements in array : ");
		int n=scan.nextInt();
		System.out.println("Enter  elements in array : ");
		int[] a=new int[n];
		for (int i = 0; i < n; i++)
			a[i]=scan.nextInt();
	
		
		System.out.println("Insertion Sort : ");
		
		Utility.insertionSortInt(a);
		
		scan.close();

	}

}
