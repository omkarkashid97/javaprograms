package Functional;

import java.util.Scanner;

public class Gambler
{

	public static void main(String[] args)
	{
		int goals,stakes,lq=0,wq=0,n,i;
		double p;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("number of times : ");
		n=scan.nextInt();
		System.out.println("eneter the goals : ");
		goals=scan.nextInt();
		System.out.println("enter number of stakes : ");
		stakes=scan.nextInt();

		for (i = 0; i < n; i++) 
		{
			p=Math.random();
			if(p<0.5)
			{
				lq++;
				stakes--;
				if(stakes==0)
					break;
			}
			else
			{
				wq++;
				stakes++;
				if(goals==stakes)
					break;
			}
		}
		
		System.out.println("Number of wins : "+wq);
		System.out.println("Number of loss : "+lq);

		System.out.println("percentage of win : "+wq*100/(wq+lq));
		System.out.println("percentage of loss : "+lq*100/(wq+lq));

		scan.close();
	}

}
