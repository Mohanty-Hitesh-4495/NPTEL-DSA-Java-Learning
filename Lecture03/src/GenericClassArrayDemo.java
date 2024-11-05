// Generic class to handle arrays of any type T
class GenericArray<T>{
    private T[] array;// Generic array

    // Constructor to load the array
    public GenericArray(T[] array){
        this.array = array; // Assign the passed array to the class variable
    }

    // Method to return the element stored at the i-th index in the array
    public T getData(int i){
        return array[i];
    }

    //Generic method to print the elements of the array
    public static <T> void printData(GenericArray<T> b) {
        for (int i = 0; i < b.array.length; i++) {
            System.out.print(b.getData(i) + " ");
        }
        System.out.println(); // Print a new line after printing the array
    }

    // Generic method to reverse the order of elements in the array
    public static <T> void reverseArray(GenericArray<T> b) {
        int front = 0;
        int rear = b.array.length - 1;
        while (front < rear) {
            // Swap elements at 'front' and 'rear' indices
            T temp = b.array[rear];
            b.array[rear] = b.array[front];
            b.array[front] = temp;
            front++;
            rear--;
        }
    }
}

public class GenericClassArrayDemo {
    public static void main(String[] args) {

        // Creating an array of Integer data
        Integer[] x = {10, 20, 30, 40, 50}; // It is an array of Integer numbers
        GenericArray<Integer> aInt = new GenericArray<>(x); // Store the data into a generic array

        // Printing the data ...
        System.out.println("Integer Array:");
        GenericArray.printData(aInt); // Print the array of integer objects

        // Reverse ordering of data ...
        GenericArray.reverseArray(aInt);
        System.out.println("Reversed Integer Array:");
        GenericArray.printData(aInt); // Print the array of integer objects after reversing

        // Creating an array of String data
        String[] y = {"A", "B", "C", "D", "E"}; // It is an array of String objects
        GenericArray<String> bString = new GenericArray<>(y); // Store the data into a generic array

        // Printing the data ...
        System.out.println("String Array:");
        GenericArray.printData(bString); // Print the array of string objects

        // Reverse ordering of data ...
        GenericArray.reverseArray(bString);
        System.out.println("Reversed String Array:");
        GenericArray.printData(bString); // Print the array of string objects after reversing

        // Creating an array of Double data
        Double[] z = {1.2, 2.3, 3.4, 4.5, 5.6}; // It is an array of double values
        GenericArray<Double> cDouble = new GenericArray<>(z); // Store the data into a generic array

        // Printing the data ...
        System.out.println("Double Array:");
        GenericArray.printData(cDouble); // Print the array of double values

        // Reverse ordering of data ...
        GenericArray.reverseArray(cDouble);
        System.out.println("Reversed Double Array:");
        GenericArray.printData(cDouble); // Print the array of double values after reversing

    }
}
