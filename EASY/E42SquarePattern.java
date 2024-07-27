import java.util.Scanner;

public class E42SquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int n = input.nextInt();

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column
            for (int j = 0; j < n; j++) {
                // Print '$' for borders or space for interior
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
        input.close();
    }
}
