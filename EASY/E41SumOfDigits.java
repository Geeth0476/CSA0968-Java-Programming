import java.util.Scanner;

public class E41SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;

        // Calculate sum of digits
        while (n != 0) {
            int rem = n % 10;  // Extract the last digit
            sum = sum + rem;   // Add digit to sum
            n = n / 10;        // Remove the last digit
        }

        // Print the sum of digits
        System.out.println("Sum of digits: " + sum);
        
        input.close();
    }
}
