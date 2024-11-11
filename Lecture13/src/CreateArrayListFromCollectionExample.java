// Creating an ArrayList from another collection using the ArrayList(Collection c) constructor.
import java.util.*;
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        // Creating a collection first. Let it be with the simple method
        ArrayList<Integer> aList = new ArrayList<>(); //Declaring aList as a collection
        aList.add(2); // Adding elements into the aList collection
        aList.add(3);
        aList.add(5);
        aList.add(7);
        aList.add(11);
        // Creating another collection initially with aList collection
        ArrayList<Integer> numbers = new ArrayList<>(aList);
        numbers.add(13); // Add two more numbers into the numbers collection
        numbers.add(17);
        System.out.println(aList); // Now, yu have two collections: aList and numbers.
        System.out.println(numbers); // Printing the two collections
    }
}