public class SwapTest1 {
    // Generic swap method
    public static <T> Object[] swap(T x, T y) {
        T temp = x;
        x = y;
        y = temp;
        // Return the swapped values in an Object array
        return new Object[]{x, y};
    }

    public static void main(String[] args) {
        // Using Integer objects
        Integer x = 99;
        Integer y = 66;

        System.out.println("Before swap: x = " + x + ", y = " + y);

        // Call the swap method and store the returned Object array
        Object[] swappedValues = swap(x, y);

        // Update x and y with the swapped values
        x = (Integer) swappedValues[0]; // Cast to Integer
        y = (Integer) swappedValues[1]; // Cast to Integer

        System.out.println("After swap: x = " + x + ", y = " + y); // Output will now show swapped values
    }
}
