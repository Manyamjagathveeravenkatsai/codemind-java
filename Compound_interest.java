import java.util.*;
class CompoundInterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r;
        double i;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        i=p*(Math.pow((1+r/100),t));
        System.out.format("%.2f",i);
    }
}