// package OOPS;
abstract class Animal{    //We hide this CLass from the User
    abstract  void walk();   //we make this Method also abstract 
                           //so we don't need to give definition to it.
    Animal(){
       System.out.println(" Base Class Constructor Call:- Animal is Creating ");

    }                       //WE created the Cosntructor 
                                       
    

}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 Legs");
    }
    Horse(){
        System.out.println(" Derived Class Constructor Call:- Horse is Created");
    }
}

class Elephant extends Animal{
public void walk(){
    System.out.println("Elephant walk on 4 Legs");
}
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse= new Horse();
        
        horse.walk();

        // Animal animal= new Animal(); 
        // animal.walk();  we cant' make Animal object so it Give runtime Error
        //OOPS concepts gives Runtime Errors 
        //Abstract is used for hiding the Class,method because it is the Blueprint
        //and we don't want that any blueprint will visible to user because it is irrevelant
        
        
    }
    
}

