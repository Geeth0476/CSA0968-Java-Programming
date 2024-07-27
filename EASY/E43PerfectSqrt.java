import java.util.Scanner;
import java.lang.Math;

public class E42PerfectSqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input
        System.out.print("Enter a number: ");
        double n = input.nextDouble();

        // Calculate square root
        double sqrt = Math.sqrt(n);

        // Print results
        System.out.println(sqrt + ", " + (-sqrt));
        
        input.close();
    }
}
