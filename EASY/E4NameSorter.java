import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E4NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        names.add("Banana");
        names.add("Carrot");
        names.add("Radish");
        names.add("Apple");
        names.add("Jack");

        System.out.print("Order (A/D): ");
        String order = scanner.nextLine();

        if ("A".equalsIgnoreCase(order)) {
            Collections.sort(names);
        } else if ("D".equalsIgnoreCase(order)) {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid choice. Please enter 'A' for ascending or 'D' for descending.");
            return;
        }

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
