import java.util.ArrayList;
import java.util.List;
public class Average {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0); 
        System.out.println("List: " + list);
        System.out.println("Average: " + average);
    }
}
