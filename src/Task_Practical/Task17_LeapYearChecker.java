package Task_Practical;

import java.util.Scanner;

public class Task17_LeapYearChecker {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean IsLeapYear = false;

        if (( year % 4 == 0 && year % 100 != 0) || (year %  400 == 0)){
            IsLeapYear = true;
        }
        if (IsLeapYear){
            System.out.println(year+ " is a Leap Year");
        }
        else {
            System.out.println(year+ " is not a Leap Year");
        }
    }
    }