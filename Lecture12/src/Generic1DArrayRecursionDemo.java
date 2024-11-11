// Generic class to handle 1D arrays of any type
class Generic1DArray<T> {
    private T[] x; // Array of generic type T
    private int size; // Size of the array

    // Constructor to initialize the array
    public Generic1DArray(T[] t) {
        this.x = t;
        this.size = t.length;
    }

    // A recursive method to reverse the array
    public void reverse1D(int length) {
        if (length > 1) { // Termination condition
            // Swap the end elements
            T temp = x[size - length];
            x[size - length] = x[length - 1];
            x[length - 1] = temp;

            // Recurse for the remaining array
            reverse1D(length - 1);
        }
    }

    // Method to print the array
    public void printArray() {
        for (T element : x) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Main class to test the generic array reverse functionality
public class Generic1DArrayRecursionDemo {
    public static void main(String[] args) {
        // Case 1: Working with an Integer array
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Generic1DArray<Integer> intA = new Generic1DArray<>(intArray);
        System.out.println("Original Integer array:");
        intA.printArray();

        intA.reverse1D(intArray.length); // Reversing the array intA
        System.out.println("Reversed Integer array:");
        intA.printArray();

        // Case 2: Working with a String array
        String[] stringArray = {"A", "E", "I", "O", "U"};
        Generic1DArray<String> stringA = new Generic1DArray<>(stringArray);
        System.out.println("Original String array:");
        stringA.printArray();

        stringA.reverse1D(stringArray.length); // Reversing the array stringA
        System.out.println("Reversed String array:");
        stringA.printArray();
    }
}
