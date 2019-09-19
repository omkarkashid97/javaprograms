package Algorithm;

import java.util.Scanner;

public class DayOfWeek 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter day :");
		int d=scan.nextInt();
		System.out.println("Enter month(1 to 12) :");
		int m=scan.nextInt();
		System.out.println("Enter year :");
		int y=scan.nextInt();
		
		Utility.DayOfWeek(d,m,y);

		scan.close();

	}

}
