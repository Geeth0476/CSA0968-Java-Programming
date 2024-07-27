import java.util.Scanner;
public class E40ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int num1 = n;
        int arm = 0;
        
        // Calculate the sum of cubes of digits
        while (num1 != 0) {
            int rem = num1 % 10;  // Get the last digit
            arm += (rem * rem * rem);  // Add the cube of the digit to the sum
            num1 /= 10;  // Remove the last digit
        }
        
        // Check if the sum is equal to the original number
        if (n == arm) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong");
        }
        
        input.close();
    }
}
