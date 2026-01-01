package ex_06_Ternary_Operator;

public class Lab_064_Interview_Ready_Question {
    static void main(String[] args) {
        int ankit_age = 21;
        String result = ankit_age > 18 ? (ankit_age > 25 ? "You can drink": "You can't drink")
                : "No you can't go to GOA";
        System.out.println(result);
    }
}
