package ex_020_OOPs_Polymorphism_methodoverriding;

public class Lab_187_Poly_MethodOverloading {
}

class Mathoperations{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){

        return a+b+c;
    }

    double add(double a, double b){

        return a+b;
    }

    String add(String a, String b){

        return a+b;
    }
}