package Algorithm;

import java.util.Scanner;

public class insertionSortString 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s=scan.nextLine();
		
		System.out.println("Insertion Sort : ");
		
		
		Utility.insertionSortString(s);
		
		scan.close();
	}

}
