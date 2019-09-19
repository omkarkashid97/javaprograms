package Algorithm;

import java.util.Scanner;

public class Utility 
{
	public static int[] bubblesortInt(int a[])
	{ 
		int temp;
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}					
			}
		}
		return a;
		
	}
	
	public static String[] bubblesortString(String[] s1)
	{
		String temp;
		for (int i = 0; i < s1.length-1; i++) 
		{
			for (int j = 0; j < s1.length-i-1; j++) 
			{
				if(s1[j].compareTo(s1[j+1])>0)
				{
					temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
		return s1;
	}

	public static void binarysearchInt(int[] a,int key)
	{
		bubblesortInt(a);
		int n=a.length;
		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			if(a[mid]<key)
			low=mid+1;
			else if(a[mid]==key)
			{
				System.out.println(key+" element found at location : "+(mid+1));
				break;
			}
			else			
				high=mid-1;
			
				mid=(low+high)/2;
				
		}
		if(low>high)
			System.out.println(key+" Element not found");
	}
	
	public static void binarysearchString(String s,String key)
	{

		String s1[]=s.split(" ");
		int n=s1.length;
		bubblesortString(s1);

		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		
		
		while(low<=high)
		{
			if(s1[mid].compareTo(key)>0)
			low=mid+1;
			else if(s1[mid].equals(key))
			{
				System.out.println(key+" string found at location : "+(mid+1));
				break;
			}
			else			
				high=mid-1;
			
				mid=(low+high)/2;
				
		}
		if(low>high)
			System.out.println(key+" String not found");
	}

	
	public static void insertionSortInt(int a[])
	{
		int temp,j;
		for (int i = 0; i < a.length; i++) 
		{
			temp=a[i];
			j=i;
			
			while(j>0 && temp<a[j-1])
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		for (int i = 0; i < a.length; i++) 
			System.out.print(" "+a[i]);
	}
	
	public static void insertionSortString(String s)
	{
		int j;
		String temp;
		String s1[]=s.split(" ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			temp=s1[i];
			j=i;
			
			while(j>0)
			{ 
				if(s1[j].compareToIgnoreCase(s1[j-1])>0)
				{
				break;
				}
					s1[j]=s1[j-1];
					j--;
				
			}
			s1[j]=temp;
		}
		for (int i = 0; i < s1.length; i++) 
			System.out.print(" "+s1[i]);
				
	}


	
	
	public static void DayOfWeek(int d,int m,int y)
	{
		int y0,m0,d0,x;
		y0=y-(14-m)/12;
		x = y0 + y0/4 - y0/100 + y0/400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + 31*m0/ 12) % 7;
		
		switch(d0)
		{
			case 0:System.out.println(" Sunday");break;
			case 1:System.out.println(" Monday");break;
			case 2:System.out.println(" Tuesday");break;
			case 3:System.out.println(" Wednesday");break;
			case 4:System.out.println(" Thursday");break;
			case 5:System.out.println(" Friday");break;
			case 6:System.out.println(" Satday");break;
		}
	}
	
	
	
	public static void binary(int n)
	{
		int i;
		
		int a[]=new int[16];
		for ( i = 0; i < 16; i++)
		{
			a[i]=n%2;
			n=n/2;
		}
		
		
		for ( i = 16-1; i >=0; i--) 
		{
			
			System.out.print(" "+a[i]);
			if(i%4==0)
				System.out.print("  ");
		}
	}
	
	public static void binaryswap(int n)
	{
		int i,temp;
		
		int a[]=new int[8];
		for ( i = 0; i < 8; i++)
		{
			a[i]=n%2;
			n=n/2;
		}
		
		for ( i = 0; i < 4; i++) 
		{
			temp=a[i];
			a[i]=a[i+4];
			a[i+4]=temp;
					
		}
		
		for ( i = 7; i >=0; i--) 
		{
			
			System.out.print(" "+a[i]);
			if(i%4==0)
				System.out.print("  ");
		}
		
		int decimal = 0;  
	    
	   for (int j = 0; j < 8; j++) 
	   {
	          temp = a[j]%10;  
	          decimal += temp*Math.pow(2,j);  
	          a[j] = a[j]/10;  
	           
	   }
	   
	   System.out.println("\nDecimal : "+decimal);
	       

	}

}
