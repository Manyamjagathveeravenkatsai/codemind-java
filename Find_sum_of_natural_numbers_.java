import java.util.*;
class SumofNnumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        int sum=0;
        for (int i=1;i<=N;i++)
        {
           sum=sum+i;
         }
         
             System.out.println(sum);
    
    }
}