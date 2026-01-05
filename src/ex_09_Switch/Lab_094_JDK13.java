package ex_09_Switch;

public class Lab_094_JDK13 {
    static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are electronic gadget");
                break;
            case 004,006,007:
                System.out.println("This is mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
