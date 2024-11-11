/* Demonstration of a one-dimensional array */
class Array {
    public static void main(String args[]) {
        int month[];  // Declaring a 1D array
        month = new int[12];  // Allocating space for 12 months

        // Initializing the array with the number of days in each month
        month[0] = 31;  // January
        month[1] = 28;  // February
        month[2] = 31;  // March
        month[3] = 30;  // April
        month[4] = 31;  // May
        month[5] = 30;  // June
        month[6] = 31;  // July
        month[7] = 31;  // August
        month[8] = 30;  // September
        month[9] = 31;  // October
        month[10] = 30;  // November
        month[11] = 31;  // December

        // Display the number of days in April (which is stored at index 3)
        System.out.println("April has " + month[3] + " days.");
    }
}
