package Algorithm;

import java.util.Scanner;

public class binarySearchString 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the string : ");
		String s=scan.nextLine();
		System.out.println("Enter the word u want to search : ");
		String key=scan.nextLine();
		
		Utility.binarysearchString(s,key);

		scan.close();
	}

}
