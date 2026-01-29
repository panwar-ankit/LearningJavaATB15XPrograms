package ex_21_OOPs_Encapsulation;

public class Lab_190_Real_Bank {
    public static void main(String[] args) {
        ICICIBank ankit = new ICICIBank("Ankit", 100);  // constructor call
        long bal = ankit.getBal();
        System.out.println("Balance of " + ankit.getName() + " is: " + bal);
    }
}

class ICICIBank {
    private String name;
    private long bal;

    // Constructor
    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }
}