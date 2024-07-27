import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E21ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        Character[] characters = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) {
            characters[i] = word.charAt(i);
        }

        Arrays.sort(characters, Collections.reverseOrder());

        System.out.print("Alphabetical Order: ");
        for (char ch : characters) {
            System.out.print(ch + " ");
        }
    }
}
