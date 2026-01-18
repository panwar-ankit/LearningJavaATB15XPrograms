package ex_16_Arrays;

import java.util.Scanner;

public class Lab_154_Arrays_User_Inputs {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();

        String[] number_marks = new String[size];

        for (int i =0; i < number_marks.length; i++ ){
            System.out.println("Enter The Marks");
            number_marks[i] = scanner.next();

        }

        System.out.println("====");

        for (int i = 0; i < number_marks.length; i++ ) {
            System.out.println(number_marks[i]);
        }

        for (String i: number_marks){
            System.out.println(i);
        }
    }
}
