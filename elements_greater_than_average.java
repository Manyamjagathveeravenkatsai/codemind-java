import java.util.*;
class greaterthanaverage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[],l=0,c=0;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
            x[i]=sc.nextInt();
        
        for (i=0;i<n;i++)
            {
             l=l+x[i];   
            }
        l=l/n;
        for (i=0;i<n;i++)
            {
                if (x[i]>=l)
                    c++;
            }
        System.out.print(c);
    }
}