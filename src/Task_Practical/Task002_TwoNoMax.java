package Task_Practical;

public class Task002_TwoNoMax {
    public static void main(String[] args) {
        // Find the maximum between the two numbers.

        int A = 10;
        int B = 20;

        // Step 1 : Find inputs /outputs
        // I/O -> A,B - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // A > B -> A
        // B> A -> B

        // Step 3
        // int max = (n1> n2) ? A : B;

        int maxvalue = (A > B) ? A : B;
        System.out.println(maxvalue);
    }
}
