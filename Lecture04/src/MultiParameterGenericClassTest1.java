// Generic class with two parameters
class PairData<T, V> {
    // Two fields of generic type T and V
    private T x;
    private V y;

    // Constructor to initialize the fields
    public PairData(T a, V b) {
        this.x = a;
        this.y = b;
    }

    // Get the T-type value for a pair-data
    public T getTvalue() {
        return x;
    }

    // Get the V-type value for a pair-data
    public V getVvalue() {
        return y;
    }

    // Method to print the values in the pair
    public void printData() {
        System.out.println(getTvalue() + ", " + getVvalue());  // Corrected the print statement
    }
}

// Driver class to test the PairData class
public class MultiParameterGenericClassTest1 {
    public static void main(String[] args) {
        // A pair data with both members as String
        PairData<String, String> a = new PairData<>("Hitesh", "Mohanty");
        a.printData();  // Output: Hitesh, Mohanty

        // A pair data with the first member as String and the second as Integer
        PairData<String, Integer> b = new PairData<>("Debasis", 789);
        b.printData();  // Output: Debasis, 789

        // A pair data with the first member as Integer and the second as String
        PairData<Integer, String> c = new PairData<>(943, "Samanta");
        c.printData();  // Output: 943, Samanta

        // A pair data with the first member as Integer and the second as Double
        PairData<Integer, Double> d = new PairData<>(555, 12.34);
        d.printData();  // Output: 555, 12.34
    }
}
