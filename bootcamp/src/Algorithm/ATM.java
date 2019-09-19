package Algorithm;

import java.util.Scanner;

public class ATM 
{
	static int count2=0;
	
	public static void atm(int []a,int r)
	{
		int count;
		for (int i = a.length-1; i >=0; i--)
		{
			if(r>=a[i])
			{
				count=r/a[i];
				r=r%a[i];
				System.out.println(a[i]+" : "+count);
				count2+=count;

				if(r==0) 
				{
					System.out.println("Total number of notes : "+count2);
					System.exit(0);
				}
				atm(a,r);
			}
			
		}	
		
	}

	public static void main(String[] args) 
	{
		int a[]= {1,2,5,10,50,100,500,1000};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter amount : ");
		int r=scan.nextInt();
		System.out.println("\nNotes required for amount : ");
		if(r==0)
			System.out.print( 0);
		else
		atm(a,r);
		
		scan.close();

 	}

}
