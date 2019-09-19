package Functional;

import java.util.Scanner;

public class Coupon 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of coupons to generate : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(collect(n));
		
		scan.close();
	}

	private static int collect(int n) 
	{
		int count=0,distinct=0;		
		boolean[] isCollected=new boolean[n];
	
		while(distinct<n)
		{
			int value=getcoupon(n);
			count++;
			if(!isCollected[value])
			{
				distinct++;
				isCollected[value]=true;
			}
				
		}
		return count;
	}

	private static int getcoupon(int n) 
	{
		
		return (int) (Math.random()*n);
	}

}
