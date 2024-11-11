/* The following program illustrate the use of the simple constructor to declare a
collection. */
import java.util.ArrayList;
public class SimpleArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<String>();
        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        // animals.add(2019); Is it valid?
        // This shows how an entire collection can be displayed
        System.out.println(animals);
    }
}