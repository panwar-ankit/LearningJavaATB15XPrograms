package ex_020_OOPs_Polymorphism_methodoverloading;

class CommonToAll {
    void openBrowser() {
        System.out.println("Starting the IE browser.");
    }
}

class ChromeTC extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Starting the CHROME browser.");
    }
}

class FirefoxTc extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Starting the FIREFOX browser.");
    }
}
