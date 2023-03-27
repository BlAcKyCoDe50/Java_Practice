interface Drawable{
    void draw();
    default void msg(){
        System.out.println("default method");
    }

    }
class Rectangle implements Drawable{
    public void draw(){                 //if we use wihout public it will give error for acces specifier. :)
        System.out.println("drawing Rectangle");    // attempting to assign weaker access privileges; was public

    }
}
class TestInterfaceDefault{
    public static void main(String[] args) {
        Drawable d= new Rectangle();
        d.draw();
        d.msg();
    }
}
                




