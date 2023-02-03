import java.util.*;
import java.util.Map.*;
class Sample
{
    public static void printElementasCount(int arr[],int n)
    {
        //write your code
        int flag=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0;i<n;i++)
        {
            if(hm.get(arr[i])==arr[i])
             { System.out.print(arr[i]+" ");
                hm.put(arr[i],-1);
                flag=1;
             }
        }
        if(flag==0)
           System.out.print("-1");
    }
    public static void main(String args[])
    {
        int n,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        printElementasCount(x,n);
    }
}