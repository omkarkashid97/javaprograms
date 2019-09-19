package Logical;
import java.lang.Math;

public class Stats5
{
	public static void main(String args[])
	{
		double a[]=new double[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Math.random();
			System.out.print(" , "+a[i]);
		}
		
		double min=Math.min(Math.min(Math.min(a[0],a[1]),Math.min(a[2],a[3])),a[4]);
		double max=Math.max(Math.max(Math.max(a[0],a[1]),Math.max(a[2],a[3])),a[4]);
		
		double sum=0;
		
		for(int i=0;i<5;i++)
		{
			 sum +=a[i];
		}
		
		double avg=sum/5;

		System.out.print("\n Minimun = "+min+"\n Maximun = "+max+"\n Average = "+avg);

	}
}