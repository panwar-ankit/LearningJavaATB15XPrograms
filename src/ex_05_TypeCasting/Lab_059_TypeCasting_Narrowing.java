package ex_05_TypeCasting;

public class Lab_059_TypeCasting_Narrowing {

    static void main(String[] args) {
        int val = 300;
       // byte b = val; // implicit narrowing
        byte b2 = (byte)val; // explicit narrowing

        System.out.println(b2);
    }
}
