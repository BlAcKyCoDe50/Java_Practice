import java.util.*;

@FunctionalInterface
interface b{
    void sum();
}



public class Lambda {
    public static void main(String[] args) {
        b obj=()-> System.out.println("in B");
        obj.sum();
    }
    }

