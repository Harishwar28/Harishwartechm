import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperandLower{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "BYe", "heLLo");

        List<String> upperCaseList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowerCaseList = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Uppercase List: " + upperCaseList);
        System.out.println("Lowercase List: " + lowerCaseList);
    }
}
