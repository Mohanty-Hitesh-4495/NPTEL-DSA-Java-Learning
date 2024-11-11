import java.util.Scanner;

public class Deletion1DArray {
    int[] a = new int[100]; // An integer array with default 100 capacity
    int size = 0; // The number of items present

    // Method to initialize the array
    public void create(int size) {
        if (size > 100) {
            System.out.println("Could not initialize, size exceeds array capacity...");
            return;
        }
        this.size = size;
        Scanner in = new Scanner(System.in); // To read from keyboard
        for (int i = 0; i < size; i++) { // Reading the numbers
            System.out.println("Enter " + (i + 1) + "th number: ");
            a[i] = in.nextInt(); // Load the i-th entry
        }
        System.out.println("Capacity = " + a.length + ", Size = " + size);
        displayArray();
    }

    // Method to delete the item at the given position
    public void delete(int loc) {
        if (size == 0) {
            System.out.println("Array is underflow: No item to delete!");
            return;
        }
        if (loc < 0 || loc >= size) {
            System.out.println("Out of range: Deletion fails...");
            return;
        }

        int item = a[loc]; // The item at loc
        for (int i = loc; i < size - 1; i++) { // Shifting operation
            a[i] = a[i + 1]; // Shift to the left one place
        }
        size--; // Decrease size after deletion
        System.out.println("Deleted item: " + item);
        System.out.println("Capacity = " + a.length + ", Size = " + size);
        displayArray(); // Display the array on the screen
    }

    // Helper method to display the array
    public void displayArray() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Deletion1DArray obj = new Deletion1DArray();
        Scanner in = new Scanner(System.in); // To read from keyboard

        // Create the array
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        obj.create(n);

        // Delete an item from the array
        System.out.println("Enter the position of the number to be deleted: ");
        int pos = in.nextInt();
        obj.delete(pos);
    }
}
