@FunctionalInterface

interface Drawable{
    public void draw();
    default void max(){
        System.out.println("Hello");
    }
}
@FunctionalInterface
interface Drawable1{
    public void draw();
    default void max1(){
        System.out.println("Hello1");
    }
}

public class lambdaExpressionExample2 {
    public static void main(String[] args) {
        int width=10;
    
    //with lambda
    Drawable d2=()->{
        System.out.println("Drawing"+width);
    };
    d2.draw();
    d2.max();
    //lambda expression for Drawable1
    Drawable1 d1=()->{
        System.out.println("Drawing"+width);
    };
    d1.draw();
}
}