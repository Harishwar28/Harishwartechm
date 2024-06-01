import java.util.Scanner;

public class Smallestvowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char smallestVowel = '\0'; 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                if (smallestVowel == '\0' || ch < smallestVowel) {
                    smallestVowel = ch;
                }
            }
        }
        if (smallestVowel != '\0') 
        {
            System.out.println(smallestVowel);
        } else 
        {
            System.out.println("No vowels found");
        }
    }
    private static boolean isVowel(char ch) 
    {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
