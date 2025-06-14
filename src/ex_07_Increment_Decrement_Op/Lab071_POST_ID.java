package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);
        System.out.println(a);
        //  Exp and Result Table
        // Line No | a | Result a
        //  5 |  10 |  NA
        // 6 |  11 |  11
        // 7 | 11(NA) | 11

        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        //  Exp and Result Table
        // Line No | a_post | Result a_post
        //  15 |  10 |  NA
        // 16 |  10 |  10
        // 17 | 11(NA) | 11
    }
}
