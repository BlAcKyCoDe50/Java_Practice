import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.print.Printer;

public class PrintWriterDemoFlush {
    public static void main(String[] args) throws IOException{
        PrintWriter pw= new PrintWriter(System.out); //write
        // PrintWriter pw= new PrintWriter(System.out,true); //make 2nd Parameter true or false

        // PrintWriter pw= new Parent(new File("abcd.txt")) //true or not work here

        Scanner in = new Scanner(System.in); //read
        for(int i=0;i<5;i++){
            pw.println(in.next());
        }
        // pw.flush();

        //pw.close();
    }
}
