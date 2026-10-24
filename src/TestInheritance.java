class AnimalSingle {
    void eat() {
        System.out.println("eating...");
    }
}

class DogSingle extends AnimalSingle {
    void bark() {
        System.out.println("Dog barking...");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        DogSingle d = new DogSingle();

        d.bark();
        d.eat();
    }
}