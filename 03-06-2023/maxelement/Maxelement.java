import java.util.Scanner;
import java.util.Vector;

public class Maxelement {


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size");
		int n=sc.nextInt();
		Vector<Integer> v=new Vector<Integer>(n);
		System.out.print("enter values into vector");
	    for(int i=0;i<n;i++)
	    {
	    	int value=sc.nextInt();
	    	v.add(value);
	    	
	    }
	    int max=0;
	    for(int i=0;i<v.size();i++)
	    {
	    	if(max<v.get(i))
	    	{
	    		max=v.get(i);
	    	}
	    }
	    System.out.print("max element is" + max);
}
}
