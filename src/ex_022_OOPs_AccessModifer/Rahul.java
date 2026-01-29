package ex_022_OOPs_AccessModifer;

public class Rahul extends Cop {

    // Constructor
    public Rahul(int bullet) {
        super(bullet);  // Call parent constructor
    }

    // Rahul's own method
    public void thisDefaultF1() {
        System.out.println("Rahul’s special method is running!");
    }

    // Main method
    public static void main(String[] args) {
        Cop r = new Cop(100);       // Create Cop object
        r.canIshoot();              // Call Cop method

        Rahul rahul = new Rahul(50); // Create Rahul object
        rahul.canIshoot();           // Call inherited method
        rahul.thisDefaultF1();       // Call Rahul’s own method
    }
}
