import java.util.Scanner;
// Define an interface for basic student details
interface StudentDetails 
{
    void inputMarks();
    void displayResults();
}
// Define an interface for grade calculation
interface GradeCalculation 
{
    void calculateTotal();
    void calculateAggregate();
    void determineGrade();
}
// Implement both interfaces in the Student class
class Student implements StudentDetails, GradeCalculation 
{
    private int[] marks = new int[6];
    private int total;
    private double aggregate;
    private String grade;
    @Override
    public void inputMarks() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < marks.length; i++) 
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    @Override
    public void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    @Override
    public void calculateAggregate() {
        aggregate = (total / (double)(marks.length * 100)) * 100;
    }

    @Override
    public void determineGrade() {
        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate >= 60) {
            grade = "First Division";
        } else if (aggregate >= 50) {
            grade = "Second Division";
        } else if (aggregate >= 40) {
            grade = "Third Division";
        } else {
            grade = "FAIL";
        }
    }

    @Override
    public void displayResults() {
        System.out.println("Total Marks: " + total);
        System.out.println("Aggregate: " + aggregate + "%");
        System.out.println("Grade: " + grade);
    }
}

public class H20Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputMarks();
        student.calculateTotal();
        student.calculateAggregate();
        student.determineGrade();
        student.displayResults();
    }
}
