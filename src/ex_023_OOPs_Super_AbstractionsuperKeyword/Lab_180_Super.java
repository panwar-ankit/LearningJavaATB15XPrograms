package ex_023_OOPs_Super_AbstractionsuperKeyword;

public class Lab_180_Super {
}

class Baseclass {
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;

    Baseclass() {
        System.out.println("DC-Parent");
    }

    Baseclass(String browser){

        this.browser = browser;
        System.out.println("DC-Parent");
    }
}
