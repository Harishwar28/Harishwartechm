import java.util.Scanner;
public class charandspace
{
	   public static void main(String[] args)
	   {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        int spaceCount = 0;
	        int charCount = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch == ' ') {
	                spaceCount++;
	            } else if (ch < '0' || ch > '9') {
	                charCount++;
	            }
	        }
	        
	        System.out.println("No of spaces : " + spaceCount + " and characters : " + charCount);
	    }
	}



