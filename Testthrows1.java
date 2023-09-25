import java.io.IOException;

public class Testthrows1 {
    void m() throws IOException{
        try{
            throw new IOException("device Error"); //checked exception
        }
        catch(Exception ex){System.out.println(ex);}
    }
    catch(Exception ex){System.out.println(ex);
    }

    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String[] args) {
        Testthrows1 obj= new Testthrows1();
        obj.p();
        System.out.println("normal flow");
    }

}
