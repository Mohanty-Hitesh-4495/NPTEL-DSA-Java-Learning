// Define a class Student
class Student {
    String name;
    float marks;

    // Constructor to initialize name and marks
    Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    // Overriding toString to print the student details
    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

// Defining a generic class with <T> as a type parameter
class GenericClass1<T> {
    T obj; // An object of type T is declared

    // Constructor of the generic class
    GenericClass1(T obj) {
        this.obj = obj;
    }

    // A Method to get the object
    public T getObject() {
        return this.obj;
    }
}

// Driver class to test the generic class functionality
public class GenericClassUserDefinedDemo {
    public static void main(String[] args) {
        // A GenericClass with Integer type
        GenericClass1<Integer> iObj = new GenericClass1<>(15);
        System.out.println(iObj.getObject());

        // A GenericClass with String type
        GenericClass1<String> sObj = new GenericClass1<>("Java");
        System.out.println(sObj.getObject());

        // A GenericClass with the user-defined Student type
        Student student = new Student("Debasis", 99.9f); // Create a Student object
        GenericClass1<Student> tObj = new GenericClass1<>(student);
        System.out.println(tObj.getObject()); // Print the Student object details
    }
}
