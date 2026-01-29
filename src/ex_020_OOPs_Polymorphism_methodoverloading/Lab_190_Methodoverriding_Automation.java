package ex_020_OOPs_Polymorphism_methodoverloading;

public class Lab_190_Methodoverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FirefoxTc f1 = new FirefoxTc();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new FirefoxTc();
        c3.openBrowser();
    }
}
