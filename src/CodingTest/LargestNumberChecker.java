package CodingTest;

import java.util.Scanner;

public class LargestNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest number is a : " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest number is b : " + b);
        else
            System.out.println("Largest number is c : " + c);
    }
}
