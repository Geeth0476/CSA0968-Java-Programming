import java.util.Scanner;

public class E19ConsonantsVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String consonants = "";
        String vowels = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch + " ";
            } else if (Character.isLetter(ch)) {
                consonants += ch + " ";
            }
        }

        System.out.println("Consonants: " + consonants.trim());
        System.out.println("Vowels: " + vowels.trim());
    }
}
