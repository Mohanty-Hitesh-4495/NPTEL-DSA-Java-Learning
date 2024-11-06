// Define the user-defined Student class
class Student {
    String name; // Name of the student
    int[] marks; // Stores the marks in three subjects

    // Constructor for the class Student
    Student(String s, int[] m) {
        this.name = s;
        this.marks = m;
    }

    // Defining a method to print student’s record
    void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Scores: " + marks[0] + " " + marks[1] + " " + marks[2]);
    }
}

// Defining a generic class with two type parameters
class GenericMultiArrays<T, S> {
    T[] a; // An array of type T
    S[] b; // An array of type S

    // Constructor that takes two arrays of different types
    GenericMultiArrays(T[] x, S[] y) {
        this.a = x;
        this.b = y;
    }

    // Get the T-type value from the T array at the i-th index
    T getDataT(int i) {
        return a[i];
    }

    // Get the S-type value from the S array at the i-th index
    S getDataS(int i) {
        return b[i];
    }

    // Overloaded methods to print elements
    void printStringData(T[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println(); // Print a new line after printing the array
    }

    // Overloaded method to print elements of Student array
    void printStudentData(S[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] instanceof Student) {
                ((Student) s[i]).printStudent(); // Call the printStudent() method
            }
        }
        System.out.println(); // Print a new line
    }

    // Method to reverse an array of type T
     void reverseStringArray(T[] t) {
        int front = 0, rear = t.length - 1;
        while (front < rear) {
            T temp = t[rear];
            t[rear] = t[front];
            t[front] = temp;
            front++;
            rear--;
        }
    }

    // Method to reverse an array of type S
    void reverseStudentArray(S[] s) {
        int front = 0, rear = s.length - 1;
        while (front < rear) {
            S temp = s[rear];
            s[rear] = s[front];
            s[front] = temp;
            front++;
            rear--;
        }
    }
}

// Driver class to test the generic arrays and overloaded methods
public class MultiArraysGenericClassTest {
    public static void main(String[] args) {
        // Creating an array of String data
        String[] t = {"A", "B", "C"}; // Array of String data

        // Creating an array of Student data
        Student[] s = new Student[3]; // Array of Student objects
        s[0] = new Student("Ram", new int[]{86, 66, 96});
        s[1] = new Student("Rahim", new int[]{88, 99, 77});
        s[2] = new Student("John", new int[]{75, 85, 95});

        // Store the data into the generic arrays
        GenericMultiArrays<String, Student> arrayData = new GenericMultiArrays<>(t, s);

        // Printing the array of strings
        System.out.println("Original String array:");
        arrayData.printStringData(t);

        // Reversing the array of strings
        arrayData.reverseStringArray(t);

        // Printing the reversed array of strings
        System.out.println("Reversed String array:");
        arrayData.printStringData(t);

        // Printing the array of students
        System.out.println("Original Student array:");
        arrayData.printStudentData(s);

        // Reversing the array of students
        arrayData.reverseStudentArray(s);

        // Printing the reversed array of students
        System.out.println("Reversed Student array:");
        arrayData.printStudentData(s);
    }
}
