package DataStructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import DataStructure.UnorderedList.node;

public class OrderedList<T>
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

	public static void main(String[] args) throws IOException
	{
		OrderedList<Integer> list=new OrderedList<Integer>();
		
		File file=new File("/home/newuser/Desktop/omkar/int.txt");
		
		Scanner scan=new Scanner(file);
		
		while(scan.hasNextLine())
		{
			int n=scan.nextInt();
		}
		scan.close();

	}

}
