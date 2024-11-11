import java.util.Scanner;

public class TwoDArray {
    int a[][]; // Declaring a 2D array
    int row;   // Number of rows
    int col;   // Number of columns

    // Constructor to initialize the array dimensions
    TwoDArray(int row, int col) {
        a = new int[row][col]; // Correct array initialization
        this.row = row;
        this.col = col;
    }

    // Method to initialize the matrix by taking input from the user
    public void initialize() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter a[" + i + "][" + j + "]: ");
                a[i][j] = in.nextInt();
            }
        }
    }

    // Display the matrix in Row-Major order
    public void printRowMajor() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Display the matrix in Column-Major order
    public void printColMajor() {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public TwoDArray addition(TwoDArray b) {
        if (this.row != b.row || this.col != b.col) {
            System.out.println("Error! Matrices are not of the same size.");
            return null;
        } else {
            TwoDArray c = new TwoDArray(row, col); // Declare the result matrix
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    c.a[i][j] = this.a[i][j] + b.a[i][j]; // Add corresponding elements
                }
            }
            return c;
        }
    }

    // Method to multiply two matrices
    public TwoDArray multiplication(TwoDArray b) {
        if (this.col != b.row) {
            System.out.println("Error! Matrices are not conformable for multiplication.");
            return null;
        } else {
            TwoDArray c = new TwoDArray(this.row, b.col); // Declare the result matrix
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < b.col; j++) {
                    c.a[i][j] = 0;
                    for (int k = 0; k < this.col; k++) {
                        c.a[i][j] += this.a[i][k] * b.a[k][j]; // Perform matrix multiplication
                    }
                }
            }
            return c;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating first matrix
        System.out.print("Enter the number of rows and columns for matrix A: ");
        int rowA = sc.nextInt();
        int colA = sc.nextInt();
        TwoDArray matrixA = new TwoDArray(rowA, colA);
        matrixA.initialize();

        // Creating second matrix
        System.out.print("Enter the number of rows and columns for matrix B: ");
        int rowB = sc.nextInt();
        int colB = sc.nextInt();
        TwoDArray matrixB = new TwoDArray(rowB, colB);
        matrixB.initialize();

        // Adding matrices
        TwoDArray resultAdd = matrixA.addition(matrixB);
        if (resultAdd != null) {
            System.out.println("Result of Matrix Addition (Row-Major): ");
            resultAdd.printRowMajor();
        }

        // Multiplying matrices
        TwoDArray resultMul = matrixA.multiplication(matrixB);
        if (resultMul != null) {
            System.out.println("Result of Matrix Multiplication (Row-Major): ");
            resultMul.printRowMajor();
        }
    }
}
