import java.util.*;
class Circularprime
{
	public static boolean isprime(int n)
	{
		int count=0;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if (n%i==0)
				count++;
		}
		if(count==0)
			return true;
		else 
			return false;
	}
	public static int reverse(int p)
	{
		int sum=0,r;
		while(p>0)
		{
			r=p%10;
			sum=sum*10+r;
			p=p/10;
		}
		return sum;
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int m;
		m=sc.nextInt();
		if(!isprime(m))
			System.out.println("not prime");
		else if (isprime(reverse(m)))
			System.out.println("circular prime");
		else 
			System.out.println("prime but not a circular prime");
	}
}