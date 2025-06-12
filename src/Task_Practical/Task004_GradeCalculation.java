package Task_Practical;

import java.util.Scanner;

public class Task004_GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks = sc.nextInt();
        sc.close();

        String grade =  (marks >= 90) ? "A+": (marks >= 75) ? "A": (marks >= 60) ? "B": (marks >= 40) ? "C" : "Fail";
        System.out.println(grade);

    }
}
