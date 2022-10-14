import java.util.*;
class CoundofWords
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int co=0;
		for (int i=0;i<s1.length();i++)
		{
		    char ch=s1.charAt(i);
			if(ch==' ')
			{
				co++;
		    }
        }
		System.out.println(co+1);
	}
}