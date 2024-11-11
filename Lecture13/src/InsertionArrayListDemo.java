// This program illustrates the insertion operation into an ArrayList collection.
import java.util.ArrayList;
public class InsertionArrayListDemo {
    public static void main(String[] args) {
        // Creating a collection first. Let it be with the simple method
        ArrayList<Integer> odd = new ArrayList<>(); // Declaring aList as a collection
        // Adding elements into the odd collection
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        System.out.println(odd);
        // Creating another collection, say number with elements from odd collection
        ArrayList<Integer> numbers = new ArrayList<>(odd);
        System.out.println(numbers); // same as odd
        // Creating another collection, say even1
        ArrayList<Integer> even1 = new ArrayList<>();
        // Add numbers into the even1 collection
        even1.add(2);
        even1.add(4);
        even1.add(6);
        // Insert all the elements of even1 collection at the end of number collection
        numbers.addAll(even1);
        System.out.println(numbers);
        // Creating another collection, say any
        ArrayList<Integer> any = new ArrayList<>();
        // Add numbers into “any” collection
        any.add(8);
        any.add(11);
        any.add(13);
        // Add the collection any at 5-th location of the collection numbers
        numbers.addAll(5, any);
        //add an object at a specific location of the colletion numbers
        numbers.add(0,0);
        System.out.println(numbers);
        // What will happen to the following?
        // numbers.add(100,999); ??
        // Since the current size of numbers will likely be much less than 100, this line will throw an IndexOutOfBoundsException.
    }
}