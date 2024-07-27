import java.util.Scanner;
import java.util.HashMap;

public class H18Frequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read inputs
        System.out.print("RansomNote: ");
        String ransomNote = input.nextLine();
        System.out.print("Magazine: ");
        String magazine = input.nextLine();

        // Create frequency maps
        HashMap<Character, Integer> ransomNoteCount = new HashMap<>();
        HashMap<Character, Integer> magazineCount = new HashMap<>();

        // Count frequencies in the ransom note
        for (char c : ransomNote.toCharArray()) {
            ransomNoteCount.put(c, ransomNoteCount.getOrDefault(c, 0) + 1);
        }

        // Count frequencies in the magazine
        for (char c : magazine.toCharArray()) {
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }

        // Check if ransom note can be constructed
        boolean canConstruct = true;
        for (char c : ransomNoteCount.keySet()) {
            if (ransomNoteCount.get(c) > magazineCount.getOrDefault(c, 0)) {
                canConstruct = false;
                break;
            }
        }

        // Output result
        if (canConstruct) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
