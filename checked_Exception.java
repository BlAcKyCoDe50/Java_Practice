import java.io.IOException;

public class checked_Exception {
   void m() throws IOException{
    throw new IOException("Device Error");
   }
   void n() throws IOException{
    m();
   }
   void p(){
    try{
        n();
    }
    catch(Exception e){   //Run this in Online Compiler if Error Occur
        System.out.println("Exception handled");
    }
}
public static void main(String[] args) {
    //TODO Auto_generated method stub
    checked_Exception obj= new checked_Exception();
    obj.p();
    System.out.println("noraml flow");
}
}
