import java.util.*;
class Descendingarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(x[i+1]>x[i])
            {
                System.out.print("no");
                System.exit(0);
            }
        }
        System.out.print("yes");
    }
}