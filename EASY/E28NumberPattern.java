import java.util.Scanner;
public class E28NumberPattern 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be printed: ");
        int number = scanner.nextInt();
        System.out.print("Max Number of times printed: ");
        int maxCount = scanner.nextInt();
        printPattern(number, maxCount);
    }
    public static void printPattern(int number, int maxCount) 
    {
        for (int i = 1; i <= maxCount; i++) 
        {
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        for (int i = maxCount - 1; i > 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
