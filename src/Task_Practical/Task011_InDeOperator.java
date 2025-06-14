package Task_Practical;

public class Task011_InDeOperator {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++ + ++x); // 12

        // x++ -> A -> ExpA -> 5 , a ->  5
        // +
        // ++x -> B -> ExpB -> 6 , a -> 7
    }
}
