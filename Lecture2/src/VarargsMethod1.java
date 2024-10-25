class VarargsMethod1 {
    // Method that accepts an array of integers
    static void varargsMethod1(int v[]) {
        System.out.print("Number of args: " + v.length + " Elements: ");
        for (int x : v) {
            System.out.print(x + " "); // Print each element
        }
        System.out.println(); // Move to the next line
    }

    public static void main(String args[]) {
        // Creating arrays for testing
        int x[] = {1, 3, 5, 7}; // 4 elements
        int y[] = {2, 4}; // 2 elements
        int z[] = {}; // No elements

        varargsMethod1(x); // Passed array with 4 values to the method
        varargsMethod1(y); // Passed array with 2 values to the method
        varargsMethod1(z); // Passed an empty array to the method
    }
}
