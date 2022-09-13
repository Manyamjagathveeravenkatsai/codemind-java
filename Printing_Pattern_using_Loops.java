import java.util.*;
class Innerreducingpattern
{
	public static void pattern(int n)
	{
        int s=2*n-1; 
        int f=0;
        int ba=s-1;
        int a[][] = new int[s][s];
        while (n != 0) {
            for (int i=f;i<=ba;i++) 
            {
                for (int j=f;j<=ba;j++) 
                {
                    if (i==f||i==ba||j==f||j==ba)
                        a[i][j] = n;
                }
            }
            ++f;
            --ba;
            --n;
        }
        print(a,s);		
	}
    public static void print(int a[][], int s)
    {
        for (int i=0;i<s;i++) 
        {
            for (int j=0;j<s;j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		pattern(n);
	}
}