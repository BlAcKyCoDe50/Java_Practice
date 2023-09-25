class Animal {
    public void sound1() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog is barking");
    }

    public void fetch() {
        System.out.println("Dog is fetching");
    }
}

public class test {
    public static void main(String[] args) {
        // Upcasting
        Animal animal=new Dog();
        animal.sound1();

        Dog dog= (Dog) animal;
        dog.sound1();
        
        }
    }

