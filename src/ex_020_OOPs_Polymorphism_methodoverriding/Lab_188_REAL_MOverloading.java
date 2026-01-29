package ex_020_OOPs_Polymorphism_methodoverriding;

public class Lab_188_REAL_MOverloading {
    public static void main(String[] args) {
        WebAutomation t1 = new WebAutomation();
        t1.openBrowser();              // Calls no-argument method
        t1.openBrowser("firefox");     // Calls overloaded method with String argument
    }
}

class WebAutomation {

    void openBrowser() {
        System.out.println("Default browser!");
    }

    void openBrowser(String browser) {
        System.out.println("Starting browser " + browser);
    }
}



