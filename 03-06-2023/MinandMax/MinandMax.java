import java.util.Arrays;
import java.util.List;

public class MinandMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8, 1, 4, 10, 12);
        if (!list.isEmpty()) {
            int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
            int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        } else {
            System.out.println("List is empty, cannot find minimum and maximum values.");
        }
    }
}
