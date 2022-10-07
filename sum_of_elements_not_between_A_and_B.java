import java.util.*;
class sumofelementsnotinAandB
{
	public static void main(String args[]) 
	{
		int x[],n,i,a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(x[i]<a || x[i]>b)
				sum+=x[i];
		}
		System.out.println(sum);
		sc.close();
	}
}