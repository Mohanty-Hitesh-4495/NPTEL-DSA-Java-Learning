class Stack<T> {
    private T[] stackArray;
    private int top;

    public Stack(int size) {
        stackArray = (T[]) new Object[size]; // Create a generic array
        top = -1;
    }

    public void push(T value) {
        stackArray[++top] = value;
    }

    public T pop() {
        return stackArray[top--];
    }

    public T peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class GenericStackExample {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(5); // Integer stack
        intStack.push(10);
        intStack.push(20);
        System.out.println("Popped from stack: " + intStack.pop());

        Stack<String> strStack = new Stack<>(3); // String stack
        strStack.push("Hello");
        strStack.push("World");
        System.out.println("Peek from stack: " + strStack.peek());
    }
}
