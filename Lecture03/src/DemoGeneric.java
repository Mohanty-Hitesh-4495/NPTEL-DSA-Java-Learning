// Generic class that can hold any type of data
class GenericClass<T> {
    private T data; // Data of type T

    // Constructor to initialize data
    public GenericClass(T data) {
        this.data = data;
    }

    // Method to get the data
    public T getData() {
        return data;
    }
}

public class DemoGeneric {
    public static void main(String[] args) {
        // Create an instance with Integer data
        GenericClass<Integer> gc1 = new GenericClass<>(45);
        System.out.println(gc1.getData());   // Output: 45

        // Create an instance with Float data
        GenericClass<Float> gc2 = new GenericClass<>(45.5f);
        System.out.println(gc2.getData());   // Output: 45.5

        // Create an instance with String data
        GenericClass<String> gc3 = new GenericClass<>("Hitesh");
        System.out.println(gc3.getData());   // Hitesh
    }
}
