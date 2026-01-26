public class Lab_164_Cars {
    public static void main(String[] args) {
        Car t = new Car();   // calls the default constructor
        System.out.println(t.name);
        Car p = new Car("Maruti");
        System.out.println(p.name);
    }
}

class Car {
    String name;
    int year;
    String model;

    // Proper constructor (no return type)
    Car() {
        name = "Unknown car";
        year = 1991;
        model = "XXX";
    }

    Car(String nameGiven){
        this.name = nameGiven;
    }
}


