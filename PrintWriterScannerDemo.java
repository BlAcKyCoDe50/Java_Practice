import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterScannerDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out,true);
        File ob1= new File("D:\\abc.txt");
        ob1.createNewFile();
        PrintWriter pw1= new PrintWriter(ob1);
        pw.println("Enter your name:- ");
        String s= sc.nextLine();
        pw1.println(s);
        Scanner sc1 = new Scanner(ob1);
        while(sc1.hasNext()){
            pw.println(sc1.next());
            System.out.println(sc1.next());
        }
        pw.close();
        sc1.close();



        
    }
}
