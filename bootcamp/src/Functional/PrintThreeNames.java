package Functional;
import java.util.Scanner;

public class PrintThreeNames
{ 
	public static void main(String args[])
	{
	 String s1,s2,s3;
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter first string : ");
     s1=scanner.nextLine();
	 System.out.println("Enter seceond string ");
	 s2=scanner.nextLine();
	 System.out.println("Enter third string : ");
	 s3=scanner.nextLine();
	 
	 System.out.println("HI "+s3+"," +s2+" AND "+s1);
	 
	 scanner.close();
	}
}