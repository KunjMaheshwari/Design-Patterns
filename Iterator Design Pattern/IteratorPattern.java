import java.util.*;

// Custom Iterable Collection
class NameCollection implements Iterable<String> {
    private List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    @Override
    public Iterator<String> iterator() {
        return names.iterator();
    }
}

// Demo
public class IteratorPattern {
    public static void main(String[] args) {
        NameCollection collection = new NameCollection();
        for (String name : collection) {
            System.out.println(name);
        }
    }
}
