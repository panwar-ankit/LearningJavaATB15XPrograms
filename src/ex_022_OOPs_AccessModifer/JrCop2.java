package ex_022_OOPs_AccessModifer;

public class JrCop2 {
    public static void main(String[] args) {
        Cop j2 = new Cop(100);   // Create Cop object with 100 bullets
        j2.canIshoot();          // Call Cop method

        // If you want to call thisDefaultF1, define it in Cop class first
        // j2.thisDefaultF1();
    }
}
