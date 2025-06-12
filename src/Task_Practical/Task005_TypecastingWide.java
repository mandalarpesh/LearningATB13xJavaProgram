package Task_Practical;

public class Task005_TypecastingWide {
    public static void main(String[] args) {
        int a = 100; //Widening -> Implicit Casting
        double b = a; // Widening -> Explicit Casting
        double b1 = (double)b;
        System.out.println(b);
        System.out.println(b1);
    }
}
