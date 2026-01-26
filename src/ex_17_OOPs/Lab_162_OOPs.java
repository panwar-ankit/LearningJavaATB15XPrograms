package ex_17_OOPs;

public class Lab_162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby("Ankit");
        Baby b3 = new Baby("Ankit", "10k");
    }
}

class Baby {
    String name;
    String money;

    // Default Constructor
    Baby() {
        System.out.println("DC");
    }

    // Parameterized Constructor with name
    Baby(String name) {
        this.name = name;
        System.out.println("PC - name: " + name);
    }

    // Parameterized Constructor with name and money
    Baby(String name, String money) {
        this.name = name;
        this.money = money;
        System.out.println("PC - name: " + name + ", money: " + money);
    }
}


