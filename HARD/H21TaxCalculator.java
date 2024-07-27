import java.util.Scanner;
public class H21TaxCalculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the income from the user
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0.0;
        // Calculate tax based on income slabs
        if (income <= 250000) 
        {
            tax = 0; // No tax for income <= 2,50,000
        } 
        else if (income <= 500000) 
        {
            tax = (income - 250000) * 0.10; // 10% tax for income between 2,50,001 and 5,00,000
        } 
        else if (income <= 1000000) 
        {
            tax = (income - 500000) * 0.20 + 25000; // 20% tax for income between 5,00,001 and 10,00,000
        } 
        else 
        {
            tax = (income - 1000000) * 0.30 + 125000; // 30% tax for income above 10,00,000
        }
        // Print the tax
        System.out.println("The tax on an income of " + income + " is: " + tax);
        // Close the scanner
        scanner.close();
    }
}