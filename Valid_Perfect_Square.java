import java.util.*;
class perfectsquare
{
    public static boolean isPerftsq(int n)
    {
        int i;
        for(i=1;i*i<=n;i++)
        {
          if(n%i==0 && n/i==i)
          return true; 
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            if( isPerftsq(n))
            System.out.println("True");
            else
            System.out.println("False");
            t--;
        }   
    }
}