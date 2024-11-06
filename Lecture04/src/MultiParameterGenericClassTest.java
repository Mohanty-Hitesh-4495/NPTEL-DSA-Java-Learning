// Generic class with two type parameters T1 and T2
class GC2<T1, T2> {
    T1 obj1; // An object of type T1
    T2 obj2; // An object of type T2

    // Constructor that accepts two parameters of types T1 and T2
    public GC2(T1 obj1, T2 obj2) {
        this.obj1 = obj1; // Assign T1 object to obj1
        this.obj2 = obj2; // Assign T2 object to obj2
    }

    // Method to print both obj1 and obj2
    public void print() {
        System.out.println("First: " + obj1);
        System.out.println("Second: " + obj2);
    }
}

public class MultiParameterGenericClassTest {
    public static void main(String[] args) {
        // Creating an instance of GC2 with Integer and String types
        GC2<Integer, String> obj1 = new GC2<>(101, "Hello");

        // Creating another instance of GC2 with Double and Boolean types
        GC2<Double, Boolean> obj2 = new GC2<>(3.14, true);

        // Printing the contents of the first object
        System.out.println("Object 1:");
        obj1.print();

        // Printing the contents of the second object
        System.out.println("\nObject 2:");
        obj2.print();
    }
}
