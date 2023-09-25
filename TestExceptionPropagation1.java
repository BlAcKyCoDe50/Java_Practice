public class TestExceptionPropagation1 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();


    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");} //some error will occur in VS code try running this code in Online Compiler
    }
    public static void main(String[] args) {
        TestExceptionPropagation1 obj= new TestExceptionPropagation1();
        obj.p();
     System.out.println("normal flow...");
    }
    
}
