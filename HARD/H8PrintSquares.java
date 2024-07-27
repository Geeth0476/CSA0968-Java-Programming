import java.util.Scanner;
public class H8PrintSquares 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = input.nextInt();
        for (int i = lower; i <= upper; i++) 
        {
            System.out.println("(" + i + ", " + (i * i) + ") ");
        }
    }
}
