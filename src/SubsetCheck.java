import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetCheck {
    public static void main(String[] args) {
        // Test with HashSet
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        System.out.println("HashSet: " + isSubset(setA, setB)); // Output: true

        // Test with LinkedHashSet
        setA = new LinkedHashSet<>();
        setB = new LinkedHashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        System.out.println("LinkedHashSet: " + isSubset(setA, setB)); // Output: true

        // Test with TreeSet
        setA = new TreeSet<>();
        setB = new TreeSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        System.out.println("TreeSet: " + isSubset(setA, setB)); // Output: true
    }

    public static <T> boolean isSubset(Set<T> setA, Set<T> setB) {
        return setB.containsAll(setA);
    }
}

