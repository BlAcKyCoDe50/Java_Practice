interface Drawable{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}

class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}

public class TestInterfaceStatic {
public static void main(String[] args) {
    Drawable d= new Rectangle();
    d.draw();
    System.out.println(Drawable.cube(5));
    Rectangle d1= new Rectangle();
    d1.draw();
    System.out.println((""));
}    
}
