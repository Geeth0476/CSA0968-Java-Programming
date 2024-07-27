import java.util.Scanner;
public class H15CharacterCounter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        System.out.println("Enter * to exit…");
        while (true) 
        {
            System.out.print("Enter any character: ");
            char input = scanner.next().charAt(0);
            if (input == '*') 
            {
                break;
            }
            if (Character.isUpperCase(input)) 
            {
                uppercaseCount++;
            } 
            else if (Character.isLowerCase(input)) 
            {
                lowercaseCount++;
            } 
            else if (Character.isDigit(input)) 
            {
                numberCount++;
            }
        }
        
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of digits: " + numberCount);
    }
}
