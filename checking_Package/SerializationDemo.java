package checking_Package;
import java.io.Serializable;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Serialization implements Serializable {
    String s;
    int i;
    double d;
    public Serialization(String s,int i,double d){
        this.s=s;
        this.i=i;
        this.d=d;
    }
    public String toString(){   //toString method convert object into String
            return "s= "+s+"; i="+i+"; d="+d;
   }

}

public class SerializationDemo {
    public static void main(String[] args) {
        try{
            Serialization object1= new Serialization("Hello", -7, 2.7e10);
            // System.out.println("object1 :"+object1);
            FileOutputStream fos= new FileOutputStream("serial.txt");  //write

            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(object1);
            oos.flush();
            oos.close();
        }
        catch(IOException e){
            System.out.println("Exception during serialization: "+e);
            System.exit(0);
        }
    }
}

