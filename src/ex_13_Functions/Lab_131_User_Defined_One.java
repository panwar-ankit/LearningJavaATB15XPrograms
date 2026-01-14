package ex_13_Functions;

import java.util.Scanner;

public class Lab_131_User_Defined_One {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a=");
        int a = scanner.nextInt();
        System.out.println("Enter a number b=");
        int b = scanner.nextInt();
        int sum = sum_two_number(a,b);
        System.out.println("Sum of the number os ="+sum);

    }
    static int sum_two_number(int a,int b){
        return a+b;
    }
}
