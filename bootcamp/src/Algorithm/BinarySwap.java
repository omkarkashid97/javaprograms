package Algorithm;

import java.util.Scanner;

public class BinarySwap 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=scan.nextInt();
		
		System.out.println("Binary swap Conversion : ");		
		Utility.binaryswap(n);
		scan.close();

	}

}
