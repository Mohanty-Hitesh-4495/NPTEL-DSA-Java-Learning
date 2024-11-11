import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        // Initialize the ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);

        // Create an iterator for the ArrayList
        Iterator<Integer> numbersIterator = numbers.iterator();

        // Iterate through the list and remove odd numbers
        while (numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if (num % 2 != 0) { // Check if the number is odd
                numbersIterator.remove(); // Remove the odd number
            }
        }

        // Print the modified list
        System.out.println("Modified List (only even numbers): " + numbers);
    }
}
