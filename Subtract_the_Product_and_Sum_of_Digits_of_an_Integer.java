import java.util.*;
class ProductandSumofDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0,prod=1;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        System.out.println(Math.abs(prod-sum));
    }
}