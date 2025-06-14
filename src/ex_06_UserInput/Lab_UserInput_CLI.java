package ex_06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
        String age_string = args[0];
//        String age_string1 = args[1];
//        String age_string2 = args[2];
        System.out.println(age_string);
//        System.out.println(age_string1);
//        System.out.println(age_string2);

        int age = Integer.parseInt(age_string); // Conversion of String (Non-Primitive data type) to Integer (Primitive data type))
        String CanIVote = age >= 18 ? "Yes" : "No";
        System.out.println(CanIVote);
    }
}
