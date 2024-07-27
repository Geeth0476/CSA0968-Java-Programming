import java.util.Scanner;
class Bank_Account 
{
    String name, type;
    int acc_num;
    double bal;
    Bank_Account(String n, int a, String t, double b) 
    {
        name = n;
        acc_num = a;
        type = t;
        bal = b;
    }
    void deposit(double d) 
    {
        if (d > 0) 
        {
            bal += d;
            System.out.println("Deposited: " + d);
        } 
        else 
        {
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double w) 
    {
        if (w > 0 && w <= bal) 
        {
            bal -= w;
            System.out.println("Withdrew: " + w);
        } 
        else 
        {
            System.out.println("Invalid amount or insufficient balance");
        }
    }
    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc_num);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + bal);
    }
}
public class H10BankApp 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String n = input.nextLine();
        System.out.print("Enter Account number: ");
        int a = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Enter the type of account: ");
        String t = input.nextLine();
        System.out.print("Enter the balance amount: ");
        double b = input.nextDouble();
        Bank_Account bank = new Bank_Account(n, a, t, b);
        bank.display();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        bank.deposit(depositAmount);
        bank.display();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        bank.withdraw(withdrawAmount);
        bank.display();
        input.close();
    }
}
