import java.util.Scanner;
class downtriangle
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in); 
    	int r = sc.nextInt();
    	for (int i=r;i<=r&&i>0; i--)
    	{
    		for (int j=1;j<=i;j++)
    		{
    			System.out.print(j);
   			}
    		System.out.println();
    	}
    	sc.close();
    }
}