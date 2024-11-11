import java.util.Scanner;

public class ArrayRandomInitializationDemo {
    int[] a = new int[100]; // Declaring a 1D array of size 100
    int size; // Actual size of the array
    int MIN = 1, MAX = 100; // Range of the random numbers

    // Method to generate a random number between min and max
    int generateRandom(int min, int max) {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public void loadArray() {
        Scanner in = new Scanner(System.in); // To read the size from the user
        System.out.println("Enter size (less than 100):");
        size = in.nextInt(); // Read array size from user input

        // Ensure the size is valid
        if (size > 100 || size < 1) {
            System.out.println("Invalid size! Enter a value between 1 and 100.");
            return;
        }

        // Generate random numbers and store them in the array
        for (int i = 0; i < size; i++) {
            a[i] = generateRandom(MIN, MAX); // Generate random number
        }

        // Display array size and the generated random numbers
        System.out.println("Capacity = " + a.length + ", Size = " + size);
        System.out.print("Array contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // For a new line
    }

    public static void main(String[] args) {
        // Create an object of the class and call the method to load the array
        ArrayRandomInitializationDemo arrayDemo = new ArrayRandomInitializationDemo();
        arrayDemo.loadArray(); // Call the method to initialize and display the array
    }
}
