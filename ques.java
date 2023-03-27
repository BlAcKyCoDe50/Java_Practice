 abstract class A{
     abstract void  add(int a,int b);
     int a=10;
}
interface C2{
    abstract void test();
    default void demo(){
        //
    }
    static  void show(){
        //

    }
}
interface C3 {
    abstract void test();
    default void demo(){
        int x=30;
    }
}
class Z extends A{
    
}



