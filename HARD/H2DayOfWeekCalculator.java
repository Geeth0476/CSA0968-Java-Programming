import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;
public class H2DayOfWeekCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        String dayOfWeek = getDayOfWeek(day, month, year);
        System.out.println("The day of the week is: " + dayOfWeek);
    }
    public static String getDayOfWeek(int day, int month, int year) 
    {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
}
