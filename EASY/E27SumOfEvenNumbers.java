public class E27SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }

        System.out.println("The sum of even numbers between 1 and 100 is: " + sum);
    }
}
