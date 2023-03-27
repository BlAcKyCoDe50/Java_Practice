// //static method can't be inherited
// //default method can be inherited
// interface A{
//     default void add(){
//         System.out.println("A Hello");
//     }
// }
// interface B{
//     default void add(){
//         System.out.println("hello");
//     }
// }
// class check implements A,B{
//     public static void main(String[] args) {
//         check c= new check();
//         c.add();
//     }
// }






// public class check {
    
// }
interface A{
    default void add(){
    System.out.println("A hello");
    }

    public void add(String string);
    }
    interface B{
    default void add(){
    System.out.println("B hello");
    }
    }
    class check implements A,B{
    public static void main(String[] args){
    check c = new check();
    c.add();
    }
    
    }
