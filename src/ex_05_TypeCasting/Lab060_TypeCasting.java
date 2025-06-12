package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 9673210880L;
        //short s = phone; // Implicit Narrow?
        short s1 = (short)phone; // Explicit Narrow?
        System.out.println(s1);
    }
}
