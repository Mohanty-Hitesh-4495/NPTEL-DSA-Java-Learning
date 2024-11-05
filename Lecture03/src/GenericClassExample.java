// Defining a Generic Class
class Box<T> {
    private T item; // Declare a generic type variable

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(); // T is Integer
        intBox.setItem(123); // Set an integer value
        System.out.println("Integer Box: " + intBox.getItem());

        Box<String> strBox = new Box<>(); // T is String
        strBox.setItem("Hello World"); // Set a string value
        System.out.println("String Box: " + strBox.getItem());
    }
}
