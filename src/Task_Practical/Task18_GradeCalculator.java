package Task_Practical;

import java.util.Scanner;

public class Task18_GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the Marks");
        Scanner sc = new Scanner(System.in);
        int marks =sc.nextInt();
        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}
