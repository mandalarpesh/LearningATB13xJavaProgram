package Task_Practical;

public class Task003_EvenOrOdd {
    public static void main(String[] args) {
        // Find the even or odd for user value.

        int valueA1 = 19;
        int valueA2 = 20;

        // Step 1 : Find inputs /outputs
        // I/O -> A1,A2- int
        // O/P -> String ->  even or odd

        // Step 2 - Rough Logic, Think about it.
        // valueA1 % 2 == 0 -> Even
        // valueA1 % != 0  -> Odd

        // Step 3
        // String result = (valueA1 % 2 == 0 ? "Even" : "Odd") //|| (valueA2 % 2 == 0 ? "Even" : "Odd");

        String result = valueA2% 2 == 0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
