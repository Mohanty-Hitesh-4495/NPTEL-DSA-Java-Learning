import java.util.Scanner;

public class Insertion1DArray {
    int[] a = new int[100]; // An integer array with a default capacity of 100
    int size = 0; // The number of elements present in the array

    // Method to create and initialize the array
    public void create(int size) {
        if (size > 100) {
            System.out.println("Could not initialize... Size exceeds capacity");
            return;
        }
        this.size = size;
        Scanner in = new Scanner(System.in); // Scanner to read from the keyboard
        for (int i = 0; i < size; i++) { // Reading the array elements
            System.out.println("Enter " + (i + 1) + "th number: ");
            a[i] = in.nextInt(); // Store the i-th entry
        }
        display(); // Display the array on the screen
    }

    // Method to insert an element at a specified location in the array
    public void insert(int item, int loc) {
        if (size == a.length) {
            System.out.println("Array overflow: Insertion fails...");
            return;
        }
        if (loc < 0 || loc > size) {
            System.out.println("Out of range: Insertion fails...");
            return;
        }

        // Shifting elements to the right to create space for the new element
        for (int i = size; i > loc; i--) {
            a[i] = a[i - 1]; // Shift each element one position to the right
        }
        a[loc] = item; // Insert the new item at the specified location
        size++; // Increase the size of the array
        display(); // Display the array on the screen after insertion
    }

    // Method to display the array
    public void display() {
        System.out.println("Array contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Capacity = " + a.length + ", Size = " + size);
    }

    // Main method to test the array insertion
    public static void main(String[] args) {
        Insertion1DArray arr = new Insertion1DArray(); // Create an object of the class
        Scanner in = new Scanner(System.in);

        // Initialize the array
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        arr.create(n); // Create the array with n elements

        // Insert a new element
        System.out.println("Enter the new number to be inserted: ");
        int newItem = in.nextInt();
        System.out.println("At which position? ");
        int pos = in.nextInt();

        arr.insert(newItem, pos); // Insert the new element at the specified position
    }
}
