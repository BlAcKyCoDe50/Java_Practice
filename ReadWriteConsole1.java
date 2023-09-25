import java.io.IOException;
import java.io.*;
import java.util.*;

public class ReadWriteConsole1 {
    public static void main(String[] args) throws IOException {
        File ob1= new File("abc1.txt"); //consider the file already exist and have the data otherwise
        // create file using following statement and some data by open file 
        // ob1.createNewFile()
        Scanner sc= new Scanner(ob1);
        PrintWriter pw= new PrintWriter(System.out);

        pw.println("Enter your name");
        while(sc.hasNext()){
            pw.println(sc.next());
            // System.out.println(sc.next());
        }

        for (int i = 0; i < 5; i++) {
            pw.println(sc.next());;
            // System.out.println(sc1.next);
        }
        pw.close();
        sc.close();

    }
}

