import java.util.*;
class Battleofprimes
{
     public static boolean isprime(int n) 
    { 
      int count=0; 
        for (int i=2;i<=(int)Math.sqrt(n);i++) 
    { 
    if (n%i==0) 
       count++; 
    } 
    if (count==0) 
        return true ; 
    else  
        return false; 
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0,p=0;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        for(int i=sum+1; ;i++)
        {
            p++;
            if (isprime(i))
            break;
        }
        System.out.println(p);
    }
}