import java.util.Scanner;

public class E36SquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Read number of rows
        int k = 1; // Initialize counter

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for each number in the row
                System.out.print(k * k + " "); // Print square of k
                k++; // Increment k
            }
            System.out.println(); // Move to next line after each row
        }

        input.close();
    }
}
