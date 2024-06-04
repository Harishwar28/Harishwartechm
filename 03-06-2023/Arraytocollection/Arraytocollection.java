import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Arraytocollection {
    public static void main(String[] args) {
      
        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> List = Arrays.asList(array);
        List<String> newList = new ArrayList<>(List);
        System.out.println("newList is " + newList);
        newList.add("Date");
        newList.add("Elderberry");
        System.out.println("List after adding elements: " + newList);
    }
}
