package multilevel;

public class Lab_170_Multilevel {
    static void main(String[] args) {
        Son ankit = new Son();
        ankit.home();
        ankit.bhk3();
        ankit.gf();  // grand father function
        ankit.extraMoney();

        Father f = new Father();
        f.gf();
        f.home();
        f.extraMoney();


        Grandfather gf = new Grandfather();

        gf.gf();  // grand father function
        gf.home();

        // Dynamic Dispatch
        Grandfather g1 = new Son();
        Father f1 = new Son();
        System.out.println(f1.);
        //Son s1 = new Grandfather();







    }
}
