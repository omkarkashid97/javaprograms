package Functional;

public class FlipCoin 
{

	public static void main(String[] args) 
	{
		int tq=0,hq=0;
		double n;
		for(int i=0;i<10;i++)
		{
			n=Math.random();
			
			if(n<0.5)
			    tq++;
			else
				hq++;
		}
		System.out.println("Perecentage of head vs tail : "+(hq*100)/10);

	}

}
