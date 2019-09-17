package com.bridgelabz.functional;
import java.util.regex.*;
import java.util.Scanner;

public class strReplace 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello <<UserName>>, How are you?");
		String str="Hello <<UserName>>, How are you?";
		System.out.println("Enter your name : ");
		
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		
	    Pattern pattern=Pattern.compile("[a-zA-Z]{3,}");
		Matcher matcher=pattern.matcher(str1);
		
		if(matcher.matches())
		{
			str=str.replace("<<UserName>>",str1);		
			System.out.println(str);
		}
		else
			System.out.println("Name should contain minimum 3 chars  ");

		scan.close();
	}

}
