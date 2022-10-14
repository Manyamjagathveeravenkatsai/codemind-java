import java.util.*;
class countofVCDS
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int vowel=0,consonants=0,d=0,s=0;
		String VOWELS="AEIOUaeiou";
		for (int i=0;i<s1.length();i++)
		{
		    char ch=s1.charAt(i);
			if(ch!=' ')
			{
				if(VOWELS.contains(ch+""))
					vowel++;
				else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) ) 
					consonants++;
			    if(ch>=48 && ch<=57)
				    d++;
		    }
		    if(ch==' ')
		        s++;
        }
		System.out.println("Vowels: "+(vowel));
		System.out.println("Consonants: "+(consonants));
		System.out.println("Digits: "+(d));
		System.out.println("White spaces: "+(s));
	}
}