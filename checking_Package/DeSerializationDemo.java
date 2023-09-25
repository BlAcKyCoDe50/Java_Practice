package checking_Package;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) {
        try{
            Serialization object2;
            FileInputStream fis= new FileInputStream("serial.txt");
            ObjectInputStream ois= new ObjectInputStream(fis); //read
            object2 = (Serialization)ois.readObject();
            ois.close();
            System.out.println("obejct 2:"+object2);
        }
        catch(Exception e){
                System.out.println("Exception during deserialization: "+e);
                System.exit(0);

        }
    }
}
