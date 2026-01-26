package ex_17_OOPs;

public class Lab_161_Cats_OOPs {
    static void main() {
        Cat c1 = new Cat();
        Cat c2 = new Cat( "oggy");
        Cat c3 = new Cat( "Lucy");
        Cat c4 = new Cat( "spicy");
        Cat c5 = new Cat( "mufsa");

        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);



    }
}

class Cat {
    String name;

    // Default constructor
    Cat() {
        System.out.println("Default Constuctor called");
    }

    // Parameterized constructor
    Cat(String nameGiven) {
        this.name = nameGiven;
        System.out.println("Cat created with name" + nameGiven);
    }
    // Method to print cat name

    Void printName() {
        System.out.println("Cat's name is" + name);


        return null;
    }
}



