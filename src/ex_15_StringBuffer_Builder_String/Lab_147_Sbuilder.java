package ex_15_StringBuffer_Builder_String;

public class Lab_147_Sbuilder {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);
    }
}
