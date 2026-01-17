package ex_15_StringBuffer_Builder_String;

public class Lab_144_StringBuilder_Vs_Buffer {
    static void main(String[] args) {

        String s0 = "Ankit";
        String s1 = new String("Ankit");

        // less than 10%
        StringBuffer stringBuffer = new StringBuffer("Ankit");
        StringBuilder stringBuilder = new StringBuilder("Ankit");

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());
    }
}
