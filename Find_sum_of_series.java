import java.util.*;
class SumofSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float sum=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+1/(float)i;
        }
      System.out.format("%.2f",sum);
    }
}