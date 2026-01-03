package ex_07_Increment_Decrement_OP;

public class Lab_070_ID_OP_PRE {
    static void main(String[] args) {
        int a = 10;
        int b = ++a;

        System.out.println(b);
        System.out.println(a);


        // ++a - a=a+1;
        // Exp and Result Table
        // Line No | a | Result b
        //    5    | 10 | N/A
        //    6    | 11 | 11
        //    8    | 11 - a
        //    9    | 11 | 11
    }
}

