// What is meant by interface in Java?
// An interface is an abstract "class" that is used to group related methods with "empty" bodies: 
// To access the interface methods, the interface must be "implemented" 
// (kinda like inherited) by another class with the implements keyword (instead of extends ).


public interface My{
    int x=10;
    void demo();

    default void show(){}//default(it is keyword not specifier)
    public static void test(){} //static method
}




public class define_interface {
    
}
