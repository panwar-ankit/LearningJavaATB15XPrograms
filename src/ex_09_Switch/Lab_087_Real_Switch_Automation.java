package ex_09_Switch;

import java.util.Scanner;

public class Lab_087_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "edge":
                    System.out.println("TC1");
                    System.out.println("TC2");
                    System.out.println("Starting the edge");
                    break;

            case "firefox":
                        System.out.println("TC1");
                        System.out.println("TC2");
                        System.out.println("Starting the firefox");
                        break;

            default:
                System.out.println("I have no idea for this browser");



        }
        scanner.close();
    }
}
