import java.util.Scanner;

public class E44PatternPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the number of rows from the user
        int n = input.nextInt();
        
        // Loop through each row from n down to 1
        for (int i = n; i >= 1; i--) {
            // Print leading spaces to align the asterisks
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
        
        // Close the scanner
        input.close();
    }
}
