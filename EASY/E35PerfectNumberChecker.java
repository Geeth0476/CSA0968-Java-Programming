import java.util.Scanner;
public class E35PerfectNumberChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(isPerfectNumber(n));
    }
    public static boolean isPerfectNumber(int n)
    {
        int sum = 0;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        if(sum == n)
        {
            return true;
        }
        return false;
    }
}

