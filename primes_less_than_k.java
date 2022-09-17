import java.util.*;
class Primeslessthank
{
    public static boolean IsPrime(int n)
    {
    	if(n<2)
    		return false;
    	int co=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
        	if(n%i==0)
        		co++;
        }
        if(co==0)
        	return true;
       	else
       		return false;
    }	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x[],i,k,n,co=0;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
			x[i]=sc.nextInt();
		k=sc.nextInt();			
		for(i=0;i<n;i++)
			if(IsPrime(x[i]))
				if(x[i]<=k)
				    co++;
		System.out.println(co);
	}
}