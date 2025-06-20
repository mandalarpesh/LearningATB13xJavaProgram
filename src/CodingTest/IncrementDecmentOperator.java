package CodingTest;

public class IncrementDecmentOperator {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original: " + i);

        System.out.println("Pre-increment (++i): " + (++i));
        System.out.println("Post-increment (i++): " + (i++));
        System.out.println("After post-increment: " + i);

        System.out.println("Pre-decrement (--i): " + (--i));
        System.out.println("Post-decrement (i--): " + (i--));
        System.out.println("After post-decrement: " + i);
    }
}
