public class AllNested {
        //static Nested Class
        static int b=20;
        void display(){
            System.out.println("non static a="+a);
            System.out.println("static b="+b);
        }   
}
//Inner Class
class inner{
    int a =10;
    final static int b=20;
//static int b=20;
//Error modifier static is only allowed in constant variable decalarations 
void display(){
    System.out.println("static b="+b);
    int a=10; //effectively finnal

   System.out.println("inner a="+a);
   //local class
   class localclass{
    int b;
    //a=20;//Error because a is effectively final
    
   }

}
}
