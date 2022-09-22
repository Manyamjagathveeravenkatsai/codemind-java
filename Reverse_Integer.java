import java.util.*;
class ReverseInteger
{
    public static int findreverse(int n)
    {
        int sum=0,r;
        while(n>0||n<0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res;
        n=sc.nextInt();
        res=findreverse(n);
        System.out.println(res);
    }
}