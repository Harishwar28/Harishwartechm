import java.util.Scanner;
public class Vowelsandconsonants {
	public static void main(String args[])
	{
		System.out.print("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch == 'a' || ch =='e' || ch =='i' || ch == 'o' || ch == 'u')
			{
				vowel++;
			}
			else if(ch>='a' && ch<='z'){
				consonant++;
			}
				
		}
		System.out.println(vowel);
		System.out.println(consonant);
		
	}

}
