package ex_15_StringBuffer_Builder_String;

public class Lab_145_SB {
    static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Ankit");
        stringBuffer.append("Panwar");
        System.out.println(stringBuffer);


        String s1 = "Ankit";
        s1 = s1+ "Panwar";
        System.out.println(s1);
    }
}
