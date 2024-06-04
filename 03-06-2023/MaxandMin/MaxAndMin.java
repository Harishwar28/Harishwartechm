import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class MaxAndMin {
	public static void main(String args[])
	{
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(10);
		l.add(20);
		l.add(30);
		if(l.size()==0 || l==null)
		{
			System.out.print("empty list");
		}
		int max=Collections.max(l);
		int min=Collections.min(l);
		System.out.println("max element in list " + max);
		System.out.println("min element in list " + min);
		
	}
	

}
