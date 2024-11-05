class ArrayHolder<T> {
    private T[] array; // Declare a generic array

    // Constructor
    public ArrayHolder(int size) {
        // Creating a generic array by casting
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }
}

public class GenericArrayExample {
    public static void main(String[] args) {
        ArrayHolder<Integer> intArray = new ArrayHolder<>(5); // Array of Integers
        intArray.set(0, 10);
        intArray.set(1, 20);
        System.out.println("Array value at index 0: " + intArray.get(0));

        ArrayHolder<String> strArray = new ArrayHolder<>(3); // Array of Strings
        strArray.set(0, "Hello");
        System.out.println("Array value at index 0: " + strArray.get(0));
    }
}
