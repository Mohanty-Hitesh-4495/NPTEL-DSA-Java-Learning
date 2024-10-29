public class SwapTest2 {
    // Generic swap method
    public static <T> void swap(T x, T y) {
        T temp = x; // Correctly declare and assign temp
        x = y; // Swap the values
        y = temp; // Swap the values
        // This swap will only happen inside this method and won't affect x and y in main.
    }

    public static void main(String[] args) {
        // Using Double objects
        Double x = 99.0; // Use auto-boxing
        Double y = 66.0; // Use auto-boxing

        System.out.println("Before swap: x = " + x + ", y = " + y);

        // Call the swap method
        swap(x, y); // This won't actually swap in main due to pass-by-value nature of Java

        System.out.println("After swap: x = " + x + ", y = " + y); // Output remains the same
    }
}
