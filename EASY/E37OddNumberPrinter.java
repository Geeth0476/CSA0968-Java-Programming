import java.util.Scanner;

public class E37OddNumberPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        
        int arr[] = new int[100];
        int j = 1;

        // Store odd numbers in the array
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
        }

        // Check if the index is within the bounds of the array
        if (n * 2 < arr.length) {
            System.out.print(arr[n * 2]);
        } else {
            System.out.println("Index out of bounds. Please enter a smaller number.");
        }
    }
}
