import java.util.Scanner;

public class E38CharacterSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the input string and character
        System.out.println("Enter the string:");
        String str = input.nextLine();
        System.out.println("Enter the character to search:");
        char c = input.next().charAt(0);
        
        // Flag to check if the character is found
        boolean found = false;

        // Search for the character in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                System.out.println(c + " is found in string at index: " + (i + 1));
                found = true;
            }
        }

        // If character was not found
        if (!found) {
            System.out.println("Character not found");
        }
        
        input.close();
    }
}
