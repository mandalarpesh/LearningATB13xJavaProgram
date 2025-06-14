package ex_08_If_Condition;

import java.util.Scanner;

public class Lab081_If_P1 {
    public static void main(String[] args) {
        System.out.println("Enter you Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>= 18){
            System.out.println("Yes, you can go to GOA");
        }
        else{
            System.out.println("No, you cannot go to GOA");
        }
    }
}
