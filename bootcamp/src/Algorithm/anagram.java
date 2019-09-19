package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two strings");
		System.out.println("string 1 : ");
		String s1=scan.nextLine();
		System.out.println("strings 2 : ");
		String s2=scan.nextLine();
		
		s1=s1.replaceAll(" ","");
		s2=s2.replaceAll(" ","");

		int flag=0;
		if(s1.length()==s2.length())
		{
				char[] ch1=s1.toCharArray();
				char[] ch2=s2.toCharArray();
				
				Arrays.sort(ch1);
				Arrays.sort(ch2);


				 for (int i = 0; i < ch1.length; i++) 
				 {
			            if (ch1[i] != ch2[i]) 
			            {
							System.out.println("Strings are not  anagram");
							flag=1;
							break;
			            }			            
				 }
				 if(flag==0)
						System.out.println("Strings are  anagram");


		}
		else
			System.out.println("Strings are not anagram");

		
		scan.close();
	}

}
