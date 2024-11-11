/* This program illustrates the creation of an ArrayList collection of user
defined type. */

import java.util.ArrayList;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printData() {
        System.out.println(name + " " + age);
    }
}

public class ArrayListUserDefinedObjectDemo{
    public static void main(String[] args) {
        // Declaring pList as a collection of type Person of capacity 5
        ArrayList<Person> pList = new ArrayList<>(5);
        pList.add(new Person("Ram", 25));
        Person p2 = new Person("Sita", 22); // Create a new object
        pList.add(p2); // add the object
        pList.add(new Person("John", 34));
        pList.add(p2); // Duplicate entry is allowed
        pList.add(new Person("Rahim", 29)); // Five objects are added
        pList.add(new Person("Lilly", 24));
        // No issue to accommodate, list grows dynamically
        pList.forEach(p -> p.printData());
        // An way to access each object in a class
    }
}