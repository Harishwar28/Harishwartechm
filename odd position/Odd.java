import java.util.Scanner;
public class Odd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if (i%2!=0)
		{
		
			System.out.print(ch);
		}
		}
	}
}


	


