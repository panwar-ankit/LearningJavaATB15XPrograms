package ex_08_If_Condition;

import java.util.Scanner;

import java.util.Scanner;

public class Lab_082_If_Else_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age > 19) {
            System.out.println("Hi");
        }

        scanner.close(); // good practice to close the scanner
    }
}

