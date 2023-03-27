class Parent {
    int a = 40;
}

class Child extends Parent {
    int a = 60;
    
    void display() {
        System.out.println(super.a); // it will give the output 40 of Parent class
        System.out.println(a); // it will give output 60 of child class
    }
}

public class parent {
    public static void main(String[] args) {
        Child p1 = new Child();
        p1.display();
    }
}
