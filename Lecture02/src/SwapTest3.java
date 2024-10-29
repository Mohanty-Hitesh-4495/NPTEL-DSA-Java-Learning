public class SwapTest3 {
    // Generic swap method
    public static <T> T[] swap(T x, T y) {
        T temp = x; // Correctly declare and assign temp
        x = y; // Swap the values
        y = temp; // Swap the values
        // Return the swapped values in an Object array
        return (T[]) new Object[]{x, y}; // Cast to Object[] and then to T[]
    }

    public static void main(String[] args) {
        // Using String objects
        String x = "99";
        String y = "66";

        System.out.println("Before swap: x = " + x + ", y = " + y);

        // Call the swap method and store the returned array
        String[] swappedValues = swap(x, y);

        // Update x and y with the swapped values
        x = swappedValues[0];
        y = swappedValues[1];

        System.out.println("After swap: x = " + x + ", y = " + y); // Output will now show swapped values
    }
}
