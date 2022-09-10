import java.util.*;
class LargestDigit
{
    public static int largestDigit(int n)
    {
        int r,max=0;
        while(n>0)
        {
            r=n%10;
            if(r==9)
            {
                max=9;
                break;
            }
            if(r>max)
            max=r;
            n=n/10;
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,result;
        n=sc.nextInt();
        result=largestDigit(n);
        System.out.println(result);
        
    }
}