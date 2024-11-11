public class ArrayDefinitionDemo {
    public static void main(String[] args) {
        // Declaring a float array and initializing it with a capacity of 100
        float x[];
        x = new float[100];

        // Reinitializing the 'args' array, typically used for command-line arguments, with a capacity of 10
        args = new String[10];

        // Declaring a boolean array to store prime-check values with a capacity of 1000
        boolean[] isPrime = new boolean[1000];

        // Declaring and initializing an integer array with Fibonacci sequence values
        int fib[] = {0, 1, 1, 2, 3, 5, 8, 13};

        // Declaring a 3D short array with dimensions [4][10][5]
        short[][][] b = new short[4][10][5];

        // Declaring and initializing a 2D double array, where some rows are null
        double a[][] = {{1.1, 2.2}, {3.3, 4.4}, null, {5.5, 6.6}, null};

        // Assigning a new double array of size 66 to the 5th row of 'a' (index 4)
        a[4] = new double[66];

        // Assigning the value 3.14 to the 66th element (index 65) of the 5th row of 'a'
        a[4][65] = 3.14;

        // Declaring an Object array to hold different types of arrays
        Object[] objects = {x, args, isPrime, fib, b, a};

        // The objects array contains references to various arrays of different types
    }
}
