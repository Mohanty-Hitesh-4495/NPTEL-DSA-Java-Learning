import java.util.Scanner;

//Initialization of a 1D array with user input from keyboard
class ArrayInitializationDemo {
    int[] a = new int[100]; // Declaring a 1D array of size 100
    int size; // Actual size of the array

    void loadArray() {
        Scanner in = new Scanner(System.in); // To read from keyboard
        System.out.println("Enter size (less than 100):");
        size = in.nextInt(); // Read the array size from the user

        // Ensure the size is valid
        if (size > 100 || size < 1) {
            System.out.println("Invalid size! Enter a value between 1 and 100.");
            return;
        }

        // Read elements from the user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th number:");
            a[i] = in.nextInt(); // Load the i-th entry
        }

        // Display the array length
        System.out.println("Length of the array = " + size);

        // Display the contents of the array
        System.out.print("Array contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // For a new line
    }

    public static void main(String[] args) {
        ArrayInitializationDemo arrayDemo = new ArrayInitializationDemo();
        arrayDemo.loadArray(); // Calling the method to load and display the array
    }
}
