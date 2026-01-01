package ex_05_TypeCasting;

public class Lab_061_TypeCasting_Used {
    static void main(String[] args) {

        int course =100;
        float NSR_GST= 18.45F;
        // int total = course + NSR_GST; //Narrowing - Implicit

        // int total = course+ (int)NSR_GST; //Narrowing - Explicit

        // System.out.println(total);

        float total2 = course+ NSR_GST; // widening - Implicit
       // float total2 = (float) course = NSR_GST; // widening - Explict

        System.out.println(total2);

    }
}
