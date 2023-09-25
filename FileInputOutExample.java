import java.io.FileInputStream;
import java.io.FileOutputStream;
//if not working then try it in Online Compiler
//buffer is used in char transfer not in byte data transfer so we are not using flush
// then also working
public class FileInputOutExample {
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin= new FileInputStream("testoutp.txt"); //byte by byte read
            fout= new FileOutputStream("sample.txt"); //byte by byte write
            int i;
            
            while((i=fin.read())!=-1){
                fout.write(i);
                // fout.flush();
                // fout.close();

            }
        }
        catch(Exception e){
                System.out.println("Exception occured");
            }
        }
    }
 

