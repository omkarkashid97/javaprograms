package Algorithm;

import java.util.Scanner;

public class TemperatureConversion
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("1.Convert temperature in Fahrenheit\n2.Convert temperature in celsius\nEnter your choice = ");
		int n=scanner.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.print("Enter the temperature in degree celsius : ");
			double c=scanner.nextDouble();
			double f=(c*9/5)+32;
			System.out.print("Temperature in Fahrenheit : "+f);
			break;
		case 2:	
			System.out.print("Enter the temperature in degree Fahrenheit : ");
			double f1=scanner.nextDouble();
			double c1=(f1-32)*5/9;
			System.out.print("\nTemperature in Celsius : "+c1);
			break;
		}
		scanner.close();
	}
}