import java.util.*;
class UniqueEvenCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,j,count=0,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j]&&i!=j)
                    {
                        count++;
                        x[j]=-999;
                    }
                }
                if(x[i]%2==0)
                    sum++;
            }
        }
        System.out.println(sum);
    }
}