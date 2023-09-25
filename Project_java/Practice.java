import java.util.*;
class Base{
    int a;
    Base(int a){
        System.out.println("I am the Base Class Constructor with Parameter and Value a "+a);
        this.a=a;
    }
    Base(){
        System.out.println("I am the Overloaded Conctructor of Base Class with no parameter");
    }
}

class child extends Base{
        int b;
        // System.out.println("I am the Child Class");
        
        child(int b){
            super(5);  //Super Keyword is used to call the Contructor with Parameter in the Child Class
            System.out.println("I am the Child Class Constructor.."+a);
        }

        child(int x,int y){
            super(x);   
            System.out.println("I am the Overloaded Constructor of Child CLass with value X "+x+" y"+y);
        }
}





public class Practice {
    public static void main(String[] args) {
        // Base b1= new Base();
        child c1= new child(4,7);

    }
}
