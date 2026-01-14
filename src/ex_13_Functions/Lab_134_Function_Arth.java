package ex_13_Functions;

import java.util.Scanner;

public class Lab_134_Function_Arth {
    public static String prompt;

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInt(scanner,"Enter the num1:");
        int b = readInt(scanner, "Enter the numb2:");

        System.out.println("You entered: a=" +a+",b="+b);

        scanner.close();

    }

    static int readInt(Scanner scanner,String prompt){
        System.out.println(prompt);
        if(scanner.hasNextInt()) {
            return scanner.nextInt();

        }else {
            System.out.println("Enter the int Only!");
            System.exit(0);
            return 0;
        }
    }
}
