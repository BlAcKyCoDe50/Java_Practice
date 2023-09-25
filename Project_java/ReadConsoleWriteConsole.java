import java.util.*;
import java.io.*;


public class ReadConsoleWriteConsole  {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        File ob1= new File("abcd.txt");
        ob1.createNewFile();
        PrintWriter pw1= new PrintWriter(ob1);
        pw1.println("Enter your name");
        for (int i = 0; i < 5; i++) {
            pw1.println(sc.next());;
            // System.out.println(sc1.next);
        }
pw1.close();
sc.close();
        
    }
}
