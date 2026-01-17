package ex_15_StringBuffer_Builder_String;

import java.sql.SQLOutput;

public class Lab_148_SB {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace( 0, 4, "C++");
        System.out.println(sb);
    }
}
