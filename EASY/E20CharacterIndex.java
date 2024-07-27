import java.util.Scanner;

public class E20CharacterIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char ch = scanner.nextLine().charAt(0);

        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(ch + " is found in string at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(ch + " is not found in the string.");
        }
    }
}
