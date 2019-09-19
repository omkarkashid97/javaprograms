package Algorithm;

public class primePalindAnagram
{
	
	 public static boolean isPrime(int n)
	 {
		 int i,flag=0;
		 for ( i = 2; i <=n/2; i++)
		 {
			if(n%i==0)
			{
				flag=1;				
				break;
			}
			
		 }
		 if(flag==0)
				return true;
				else
				return false;
		
	 }
	 
	 public static int palindrome(int n)
	 {
		 int rem=0,sum=0;
		 while(n>0)
		 {
			 rem=n%10;
			 n=n/10;
			 sum=sum*10+rem;
			 
		 }
		 return sum;
	 }

	public static void main(String[] args) 
	{
		 int p;
			for (int i = 2; i < 1000; i++) 
			{
				if(isPrime(i))
				{
					p=palindrome(i);
					if(isPrime(p))
					{
						System.out.println(" "+i);
					}
				}

			}
	}

}
