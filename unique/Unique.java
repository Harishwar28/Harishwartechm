import java.util.Scanner;

public class Unique {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter input");
		String input=sc.nextLine().toLowerCase();
		StringBuilder uniqueChars=new StringBuilder();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if (uniqueChars.indexOf(String.valueOf(c))== -1)
			{
				uniqueChars.append(c);
			}
		}
	
		System.out.println(uniqueChars.toString());
	}

}
