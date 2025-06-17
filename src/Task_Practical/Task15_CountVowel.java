package Task_Practical;

public class Task15_CountVowel {
    public static void main(String[] args) {
        String str = "Arpesh";
        str = str.toLowerCase();

        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of Vowels : " + vCount);
        System.out.println("Number of Constants : " + cCount);
    }
}