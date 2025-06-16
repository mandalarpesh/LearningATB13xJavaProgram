package Task_Practical;

import java.util.Scanner;

public class Task14_TriangleClassifier {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Get input from the user
                System.out.print("Enter the three sides of the triangle: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                // Check for validity
                if (a <= 0 || b <= 0 || c <= 0) {
                    System.out.println("Invalid input: Side lengths must be positive");
                }  else if (a == b && b == c) {
                    System.out.println("Equilateral triangle");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles triangle");
                } else {
                    System.out.println("Scalene triangle");
                }

                sc.close();
            }
        }

