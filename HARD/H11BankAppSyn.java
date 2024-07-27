class Customer 
{
    private int accountNo;
    private String accName;
    private double balance;
    public Customer(int accountNo, String accName, double balance) 
    {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }
    public synchronized void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
            notify(); // Notify any waiting threads that balance has been updated
        } 
        else 
        {
            System.out.println("Invalid deposit amount");
        }
    }
    public synchronized void withdraw(double amount) 
    {
        while (amount > balance) 
        {
            try 
            {
                System.out.println("Insufficient balance. Waiting for deposit...");
                wait(); // Wait until balance is sufficient
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(amount + " withdrawn. New balance: " + balance);
    }
    public synchronized void displayBalance() 
    {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Name: " + accName);
        System.out.println("Balance: " + balance);
    }
}
public class H11BankAppSyn 
{
    public static void main(String[] args) 
    {
        Customer customer = new Customer(12345, "John Doe", 500.0);

        Thread t1 = new Thread(() -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = input.nextDouble();
            customer.withdraw(withdrawAmount);
        });

        Thread t2 = new Thread(() -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter amount to deposit: ");
            double depositAmount = input.nextDouble();
            customer.deposit(depositAmount);
        });
        t1.start();
        t2.start();
        try 
        {
            t1.join();
            t2.join();
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        customer.displayBalance();
    }
}