import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class H4FactorFinder 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the nth factor to find: ");
        int n = input.nextInt();
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) 
        {
            if (num % i == 0) 
            {
                factors.add(i);
            }
        }
        int numberOfFactors = factors.size();
        System.out.println("Number of factors = " + numberOfFactors);
        if (n > 0 && n <= numberOfFactors) 
        {
            System.out.println(n + "th factor of " + num + " = " + factors.get(n - 1));
        } 
        else 
        {
            System.out.println("Invalid input: " + n + " is out of range.");
        }
    }
}
