package Task_Practical;

public class Task009_InDeOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("a: " + a + ", b: " + b);

        // Line No. |  a    |  Exp
        // 5        | 5     | NA
        // 6        | 5     | NA
        // 7        |  NA   | a = 5 , b = 6
    }
}
