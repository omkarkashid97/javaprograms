package Algorithm;

public class prime 
{

	public static void main(String[] args) 
	{
		 int flag;
		for (int i = 2; i < 1000; i++) 
		{
			flag=0;
			for (int j = 2; j <=i/2; j++) 
			{
				if(i%j==0)
				{
					flag=1;
				}			
			}
			if(flag==0)
				System.out.print(i+" ");
		}

	}

}
