import java.util.*;
class Areaofcircle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float area;double pi=3.14;
        r=sc.nextInt();
        area=(float)pi*r*r;
        System.out.format("%.2f",area);
    }
}