import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0,k=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
           if(i%2==0)
           c=c+x[i];
           else
           k=k+x[i];
        }
        System.out.println(Math.abs(c-k));
    }
}