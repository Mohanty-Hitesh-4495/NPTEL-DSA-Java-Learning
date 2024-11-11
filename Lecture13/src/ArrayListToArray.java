import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> al = new ArrayList<>();

        // Add elements to the ArrayList
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        // Display the contents of the ArrayList
        System.out.println("Contents of al: " + al);

        // Convert the ArrayList to an array
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia); // Alternatively, you could use: Object[] ia = al.toArray();

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i : ia) {
            sum += i;
        }

        // Display the sum
        System.out.println("Sum is: " + sum);
    }
}
