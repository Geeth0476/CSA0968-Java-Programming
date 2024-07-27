import java.util.Scanner;

public class E39NumberPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the number from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Print the increasing pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Print the decreasing pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        input.close();
    }
}
