package Task_Practical;

public class Task010_InDeOperator {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i); // 4
    }
}
