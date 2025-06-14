package Task_Practical;

public class Task013_InDeOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a: " + a); // Output: 7
        System.out.println("b: " + b); // Output: 12
    }
}
