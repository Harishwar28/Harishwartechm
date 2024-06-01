import java.util.Scanner;

public class Lastchar {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) 
        {
            if (!word.isEmpty())
            {
            	
                char lastChar = word.charAt(word.length() - 1);
                if (!Character.isDigit(lastChar))
                {
                    result.append(lastChar);
                }
            }
        }
    
        System.out.println(result.toString());
    }
}
