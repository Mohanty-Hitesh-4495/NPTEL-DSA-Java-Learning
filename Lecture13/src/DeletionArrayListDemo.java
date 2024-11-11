import java.util.ArrayList;
import java.util.function.Predicate;

public class DeletionArrayListDemo {
    public static void main(String[] args) {

        // Create a collection. Initially empty
        ArrayList<String> langs = new ArrayList<String>();

        // Add elements into the collection
        langs.add("C");
        langs.add("C++");
        langs.add("Java");
        langs.add("Python");
        langs.add("R");
        langs.add("Spark");
        System.out.println("Initial List: " + langs);

        // Removing elements from the collection
        langs.remove(5); // Remove the element at index 5
        System.out.println("After remove(5): " + langs);

        // Remove the first occurrence of the given element from the ArrayList
        boolean status = langs.remove("Smalltalk");
        System.out.println("Smalltalk is removed : " + status);

        // Remove all the elements that exist in a given collection
        ArrayList<String> script = new ArrayList<>();
        script.add("SQL");
        script.add("Python");
        script.add("Javascript");
        langs.removeAll(script); // Remove intersection of langs and script
        System.out.println("After script removal: " + langs);

        // Remove all the elements that satisfy the given predicate
        langs.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });
        // Alternative using lambda expression
        // langs.removeIf(s -> s.startsWith("C"));
        System.out.println("After Removing all elements that start with \"C\": " + langs);

    }
    }