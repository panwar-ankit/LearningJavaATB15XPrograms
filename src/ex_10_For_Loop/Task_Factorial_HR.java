import java.util.Scanner;

public class Task_Factorial_HR {

    public static void main(String[] args) {

        System.out.println("Welcome to the factorial Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive int number");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Please enter a positive integer");
            } else {
                int fact = 1;

                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }

                System.out.println("Factorial is => " + fact);
            }
        } else {
            System.out.println("Please enter a valid int value");
        }

        scanner.close();
    }
}
