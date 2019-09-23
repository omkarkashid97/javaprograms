package DataStructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedList<T>
{
	class node<T> 
	{
		T data;
		node<T> next;
		public Object temp;
		
		public node(T data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public node<T> head=null;
	public node<T> tail=null;
	

	
	public void add(T data)
	{
		node<T> newnode=new node<T>(data);
		
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
			
		}
		
	}
	
	public  int search(T key)
	{
		 node<T> temp = head, prev = null; 
		 
	        if (temp != null && temp.data.equals(key)) 
	        { 
	            head = temp.next; 
	            return 0; 
	        } 
	  
	       
	        
	        while (temp != null && !temp.data.equals(key)) 
	        { 
	            prev = temp; 
	            temp = temp.next; 
	            
	        }     
	  
	        
	        if (temp ==null)
	        	return 1;
	  
	         
	        prev.next = temp.next;
			return 0; 
	        
	}
	
	public void display()
	{
		node<T> current=head;
		
		if(current==null)
		System.out.println("Link list is Empty");
		
		
			while(current!=null)
			{
				System.out.print(" "+current.data);
				current=current.next;
			}
		System.out.println();
	}

	public String addtofile()
	{
		node<T> current=head;
			
		String s ="";
			while(current!=null)
			{
				s+=current.data+" ";
				current=current.next;
			}
		return s;
	}
	
	public static void main(String[] args) throws IOException
	{
		UnorderedList<String> list=new UnorderedList<String>();
		
		File file=new File("/home/newuser/Desktop/omkar/abc.txt");
		Scanner scan=new Scanner(file);
		
		 Scanner scan1 = new Scanner(System.in);
		
		while(scan.hasNextLine())
		{
		 String s=scan.nextLine();
		 String s1[]=s.split(" ");
			for (int i = 0; i < s1.length; i++) 
			{
				list.add(s1[i]);
			}
			
		}
		
		
		list.display();
		
		System.out.println("Enter the word u want ot search : ");
		String s2=scan1.nextLine();
		int n=list.search(s2);
		
		if(n==1)
		list.add(s2);
		list.display();
		
		String s3=list.addtofile();
		FileWriter fw=new FileWriter(file);
		BufferedWriter bf=new BufferedWriter(fw); 
		bf.write(s3);
		bf.close();
		scan.close();
		
	
	}



	

}
