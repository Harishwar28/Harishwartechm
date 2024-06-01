import java.util.Scanner;
public class Revstring {
	
   public static void main(String args[])
{
    System.out.print("enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String rev=" ";
	for(int i=0;i<str.length();i++)
	{
		rev=str.charAt(i)+rev;
	}
	System.out.print(rev);
}
}
