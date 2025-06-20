package CodingTest;

public class ImplicitExplicit {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;
        int exprResult = a + (int)b * 2 - 1;

        double implicitCast = a + b;

        int explicitCast = (int)(a + b);
        System.out.println("Expression result: " + exprResult);
        System.out.println("Implicit casting: " + implicitCast);
        System.out.println("Explicit casting: " + explicitCast);
    }
}
