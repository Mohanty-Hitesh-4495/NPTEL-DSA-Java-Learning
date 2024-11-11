/* This program will print on the screen using a declared print method and duplicate an array. */

public class PrintingArrays {

    // Static method to print an array of integer type
    public static void print(int[] a) {
        System.out.printf("{%d", a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
        }
        System.out.println("}");
    }

    // Overloaded method to print data of any type (using Object array)
    public static void print(Object[] a) {
        System.out.printf("{%s", a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %s", a[i]);
        }
        System.out.println("}");
    }

    // Main method
    public static void main(String[] args) {
        int[] a = {22, 44, 66, 88}; // Create an array of integers
        print(a); // Print array a

        int[] b = a.clone(); // Duplicate a[] into b[]
        print(b); // Print duplicated array b

        String[] c = {"AB", "CD", "EF"}; // Create an array of strings
        print(c); // Print array c

        String[] d = c.clone(); // Duplicate c[] into d[]
        print(d); // Print duplicated array d

        // Modify the original array c
        c[1] = "XYZ"; // Change c[], but not d[]

        // Print arrays after modification
        print(c); // Print modified array c
        print(d); // Print unchanged array d
    }
}
