public class PrintGeneric <T>{
    // Defining a generic method to print any data type
    void genericPrint (T t) {
        System.out.println (t);
    }
    public static void main(String[] args) {

        // Creating an object of the class DemoClass
        PrintGeneric aObj = new PrintGeneric();

        // Calling generic method with int argument
        aObj.genericPrint(101);

        // Calling generic method with String
        aObj.genericPrint("Joy with Java");

        // Calling generic method with double
        aObj.genericPrint(3.1412343);
    }
}