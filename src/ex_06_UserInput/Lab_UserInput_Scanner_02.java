package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);

        System.out.println("Enter the Integer");
        int int_input = sc.nextInt();
        System.out.println(int_input);

        System.out.println("Enter the Double");
        double double_input = sc.nextDouble();
        System.out.println(double_input);
    }
}
