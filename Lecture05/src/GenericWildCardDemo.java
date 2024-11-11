// Generic Student class with a type parameter bounded by Number
class Student<T extends Number> {
    String name;
    T[] marks; // Array to store the marks obtained by a student

    // Constructor for the generic class Student
    Student(T[] m) {
        marks = m;
    }

    // Method to calculate the total of marks obtained by a student
    double total() {
        double sum = 0.0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i].doubleValue(); // Convert marks to double for summing
        }
        return sum;
    }

    // This method compares the marks obtained by this student with another student
    boolean compareMarks(Student<? extends Number> others) {
        return total() == others.total();
    }
}

// Driver class to instantiate the Student generic class with different number formats
class GenericLimitationDemo {
    public static void main(String args[]) {
        // Marks stored as Integer for s1
        Integer intMarks1[] = {44, 55, 33, 66, 77};
        Student<Integer> s1IntMarks = new Student<>(intMarks1);
        System.out.println("Total marks for s1: " + s1IntMarks.total());

        // Marks stored as Integer for s2
        Integer intMarks2[] = {49, 39, 53, 69};
        Student<Integer> s2IntMarks = new Student<>(intMarks2);
        System.out.println("Total marks for s2: " + s2IntMarks.total());

        // Compare marks between s1 and s2
        if (s1IntMarks.compareMarks(s2IntMarks))
            System.out.println("Same marks");
        else
            System.out.println("Different marks");

        // Marks stored as Double for s3
        Double doubleMarks[] = {43.5, 55.5, 32.5, 66.5, 77.0};
        Student<Double> s3DoubleMarks = new Student<>(doubleMarks);
        System.out.println("Total marks for s3: " + s3DoubleMarks.total());

        // Marks stored as Float for s4
        Float floatMarks[] = {50.0F, 40.0F, 60.0F, 65.0F};
        Student<Float> s4FloatMarks = new Student<>(floatMarks);
        System.out.println("Total marks for s4: " + s4FloatMarks.total());

        // Compare marks between s2 and s3 (Integer vs Double) using wildcard
        if (s2IntMarks.compareMarks(s3DoubleMarks))
            System.out.println("Same marks");
        else
            System.out.println("Different marks");

        // Compare marks between s3 and s4 (Double vs Float) using wildcard
        if (s3DoubleMarks.compareMarks(s4FloatMarks))
            System.out.println("Same marks");
        else
            System.out.println("Different marks");
    }
}
