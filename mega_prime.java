import java.util.*;
class Megaprime
{
    public static boolean isprime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static int digit(int n)
    {
        int temp=0;
        while(n>0)
        {
            int r=n%10;
            temp=r;
            n=n/10;
        }
        return temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(digit(n))&&isprime(n))
            System.out.println("Mega Prime");
        else
            System.out.println("Not Mega Prime");
    }
}