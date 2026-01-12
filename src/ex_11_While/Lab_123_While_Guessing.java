package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab_123_While_Guessing {
    static void main(String[] args) {

        // guess the number from 1 to 100
        // n =56
        // 90, number <, 50,number>, 55, 56 - times =9

        Random random = new Random();
        int numberToguess = random.nextInt(100);
        System.out.println(numberToguess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts =0;

        while(true){
            if (!scanner.hasNextInt()){
                System.out.println("Invalid Input");
                scanner.next();
                continue;

            }
            guess = scanner.nextInt();
            attempts++;

            if (guess< numberToguess) {
                System.out.println("Too low, Try again");
            }
            else if(guess > numberToguess) {
                System.out.println("Too High, Try again");
            }{
                System.out.println("Correct! You have taken ->" + attempts);
                break;



            }
        }






    }
}
