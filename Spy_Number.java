import java.util.*;
class Jagath
{
 public static int finddigitproduct(int n)
 { 
  int product=1,r;
while(n>0)

{
   r=n%10;
   product=product*r;
    n=n/10;
 }
return product;
}
 public static int finddigitsum(int n)
 { 
  int sum=0,r;
while(n>0)

{
   r=n%10;
   sum=sum+r;
    n=n/10;
 }
return sum;
}

 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 int n,res1,res2;
 n=sc.nextInt();
res1=finddigitproduct(n);
res2=finddigitsum(n);
if (res1==res2)
System.out.println("Spy Number");
else 
System.out.println("Not Spy Number");
}
}