class SpecificArrayInt {
    // Declaring an array of integer numbers
    int[] a; // Corrected to declare an integer array

    // Constructor to load the array
    SpecificArrayInt(int[] a) {
        this.a = a; // Assign the input array to the class variable
    }

    // Method to print the array elements
    void printInt() {
        for (int x : a) {
            System.out.println(x); // Print each element of the array
        }
    }

    // Method to reverse the array elements
    void reverseInt() {
        int j = a.length - 1; // Initialize j to the last index
        for (int i = 0; i < j; i++) {
            int temp = a[i]; // Store the current element
            a[i] = a[j]; // Swap with the element at index j
            a[j] = temp; // Assign the stored element to the end
            j--; // Move j towards the beginning
        }
    }
}

class MainClassInt {
    public static void main(String[] args) {
        // This class uses SpecificArrayInt to manipulate data in it
        int[] array = {1, 2, 3, 4, 5}; // Create an integer array
        SpecificArrayInt a = new SpecificArrayInt(array); // Pass the array to the constructor

        System.out.println("Original array:");
        a.printInt(); // Print original array

        a.reverseInt(); // Reverse the array

        System.out.println("Reversed array:");
        a.printInt(); // Print reversed array
    }
}
