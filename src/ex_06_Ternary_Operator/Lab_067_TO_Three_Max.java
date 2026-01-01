package ex_06_Ternary_Operator;

public class Lab_067_TO_Three_Max {
    static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = -11;

        int MAX_OUT_OF_THREE = (n1>n2) ? ((n1>n3) ? n1 : n3) : ((n2>n3) ? n2:n3);

        System.out.println(MAX_OUT_OF_THREE);


    }
}
