package ex_020_OOPs_Polymorphism_methodoverloading;

public class Lab_189_MOverriding {
    static void main(String[] args) {
        Ankit p1 = new Ankit();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Ankit();
        f2.home();
    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Ankit extends Father{

    @Override
    void home(){
        System.out.println("3bhk");
    }
}
