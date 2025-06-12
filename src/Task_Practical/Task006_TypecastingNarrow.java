package Task_Practical;

public class Task006_TypecastingNarrow {
    public static void main(String[] args) {
        double a = 100;
        int a1 = (int)a;    // Narrowing (int -> byte) - Explicit Casting is not allowed.
        System.out.println(a1);
    }
}
