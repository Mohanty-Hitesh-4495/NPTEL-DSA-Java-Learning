// Define a generic class with a bounded type <T extends Number>
class GenericBound<T extends Number> {
    T[] array; // An array of type T

    // Constructor that takes an array of type T
    GenericBound(T[] t) {
        array = t;
    }

    // Method to calculate the average of the array
    double average() {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue(); // Safely call doubleValue()
        }
        return sum / array.length;
    }
}

// Driver class to demonstrate the use of GenericBound
class GenericBoundDemo {
    public static void main(String args[]) {
        // Create an array of Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericBound<Integer> intData = new GenericBound<>(intArray);
        double avgInt = intData.average();
        System.out.println("Average of Integer array: " + avgInt);

        // Create an array of Double
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericBound<Double> doubleData = new GenericBound<>(doubleArray);
        double avgDouble = doubleData.average();
        System.out.println("Average of Double array: " + avgDouble);

        // This part will cause a compile-time error because String does not extend Number
        // Uncommenting the code below will result in an error.
        /*
        String[] strArray = {"1", "2", "3", "4", "5"};
        GenericBound<String> strData = new GenericBound<>(strArray); // ERROR!
        double avgStr = strData.average(); // ERROR!
        System.out.println("Average of String array: " + avgStr);
        */
    }
}
