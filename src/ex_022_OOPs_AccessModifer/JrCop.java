package ex_022_OOPs_AccessModifer;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(5);   // Create Cop object with 5 bullets
        jrCop.canIshoot();        // Call method
    }
}
