import java.util.Scanner;
public class H5PrimeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int primes [] = new int[100];
        int x = 0;
        for (int i = 2; x < 100; i++) 
        {
            if (isPrime(i)) 
            {
                primes[x] = i;
                x++;
            }
        }
        System.out.println(n + "th prime number is " + primes[n - 1]);
        System.out.print(n + " prime numbers after " + primes[n - 1] + " are: ");
        for (int i = n; i < n + n; i++) 
        {
            System.out.print(primes[i] + " ");
        }
    }
    public static boolean isPrime(int num) 
    {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) return false;
        }
        return true;
    }
}
