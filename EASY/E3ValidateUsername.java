import java.util.Scanner;

public class E3ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        if (isValidUsername(username)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

    public static boolean isValidUsername(String username) {
        if (username.length() < 4 || username.length() > 20) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
