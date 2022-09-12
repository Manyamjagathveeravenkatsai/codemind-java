import java.util.*;
class Triangleprint
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		if(n>=3 && n<=100)
		{
		    for(int i=1;i<=2*n-1;i++)
		    {
		    	int k=1;
		    	if(i<=n)
			    	k=i;
			    else
			    	k=n-i%n;
			    for(int j=1;j<=k;j++)	
			    	System.out.print("*");
		    	System.out.println();	
		    }
		}
		else
		{
		    System.out.println("The pattern is not possible");
		}
	}
}