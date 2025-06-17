package Task_Practical;

public class Task16_PalidromeString {
    public static void main(String[] args) {
        String str = "Naman";      // Given String
        str = str.toLowerCase();  //normalized to Lower Case
        //System.out.println(str);

        String revstr = "";

     //Initialize flag as true
        boolean IsPalidrome = true;
       // int length = str.length();

        for (int i = str.length()-1; i  >= 0; --i){
        revstr = revstr + str.charAt(i);
        }
        if (IsPalidrome = true){
            System.out.println("The Given String is a Palidrome : " +revstr);
        }
        else{
            System.out.println("The Given String is not a Palidrome : " +revstr);
        }
    }
}
