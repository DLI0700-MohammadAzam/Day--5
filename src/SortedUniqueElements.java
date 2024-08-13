import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortedUniqueElements {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(7);
        inputList.add(2);
        inputList.add(9);
        inputList.add(1);
        inputList.add(2);
        inputList.add(9);

        TreeSet<Integer> sortedUniqueSet = getSortedUniqueElements(inputList);
        System.out.println("Sorted Unique Elements: " + sortedUniqueSet); // Output: [1, 2, 7, 9]
    }

    public static TreeSet<Integer> getSortedUniqueElements(List<Integer> list) {
        return new TreeSet<>(list);
    }
}

