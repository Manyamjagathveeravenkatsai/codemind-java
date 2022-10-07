import java.util.*;
class OddElementsfollowedbyEven
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int x[],n,Eve[],Odd[],i,j=0,k=0;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
			x[i]=sc.nextInt();
		Eve=new int[n];
		Odd=new int[n];
		for(i=0;i<n;i++)
			if(x[i]%2==0)
				Odd[k++]=x[i];
			else
				Eve[j++]=x[i];
		for(i=0;i<j;i++)
			System.out.print(Eve[i]+" ");
		for(i=0;i<k;i++)
			System.out.print(Odd[i]+" ");
		sc.close();
	}
}