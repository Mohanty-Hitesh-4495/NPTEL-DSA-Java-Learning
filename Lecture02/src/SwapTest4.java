class Person {
    String name;
    float marks;
    // Constructor
    Person(String name, float marks) {
        this.name = name;
        this.marks = marks; // Added missing semicolon
    }

    // Override toString method to display person details
    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }
}

class SwapTest4 {
    public static void swap(Object x, Object y) {
        Object t = x; // Correctly declare and assign temp
        x = y; // Swap the values
        y = t; // Swap the values
        // This swap will only happen inside this method and won't affect x and y in main.
    }

    public static void main(String[] args) {
        Object p1 = new Person("Sumit", 99.9f); // Use standard double quotes
        Object p2 = new Person("Rahul", 66.6f); // Create another Person object

        System.out.println("Before swap: p1 = " + p1 + ", p2 = " + p2); // Use standard double quotes
        swap(p1, p2); // This won't actually swap in main due to pass-by-value nature of Java
        System.out.println("After swap: p1 = " + p1 + ", p2 = " + p2); // Output remains the same
    }
}
