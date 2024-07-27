import java.util.Scanner;

public class H16Roman {
    // Method to get the decimal value of a Roman numeral character
    public static int value(char c) {
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return -1; // Return -1 for invalid Roman numeral characters
    }

    // Method to convert a Roman numeral string to a decimal value
    public static int romantodecimal(String str) {
        int res = 0; // Initialize result

        for(int i = 0; i < str.length(); i++) {
            // Get the value of the current Roman numeral character
            int s1 = value(str.charAt(i));

            // Check if the next character is within the bounds of the string
            if(i + 1 < str.length()) {
                // Get the value of the next Roman numeral character
                int s2 = value(str.charAt(i + 1));

                // If the current value is greater than or equal to the next value, add it to the result
                if(s1 >= s2) {
                    res = res + s1;
                } else {
                    // If the current value is less than the next value, subtract it from the next value and add to the result
                    res = res + s2 - s1;
                    i++; // Skip the next character
                }
            } else {
                // If there is no next character, add the current value to the result
                res = res + s1;
            }
        }

        return res; // Return the final result
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String str = input.next();
        System.out.println("Decimal value: " + romantodecimal(str));
    }
}
