import java.util.*;
class Absolutediffnumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,len,d1,d2;
        n=sc.nextInt();
        x=sc.nextInt();
        len=(int)Math.log10(n)+1;
        d2=n%(int)Math.pow(10,x);
        d1=n/(int)Math.pow(10,len-x);
        System.out.println(Math.abs(d1-d2));
    }
}