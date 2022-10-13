import java.util.*;
class Descendingarray
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
            x[i]=s.nextInt();
        int co=0;
        for(int i=0;i<(n-1);i++)
        {
            if (x[i]>x[i+1])
                co++;
        }
        if(x[n-2]>x[n-1])
            co++;
        if (co==n)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}