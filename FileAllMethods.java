import java.io.*;
public class FileAllMethods {
            public static void main(String[] args) throws IOException {
                File f= new File("abc.txt"); //for Parent : E:\\LPU\\abc.txt
                f.createNewFile();
                System.out.println("===============================");
                System.out.println("List of Various Methods work with File: n\n\n");
                System.out.println("File name: "+f.getName());
                System.out.println("Path: "+f.getPath());

            // System.out.println("Path: "+f.getPath());
            System.out.println("Last Modified: "+new java.util.Date(f.lastModified()));
            System.out.println("Absoulute Path: "+f.getAbsolutePath());
            // System.out.println("Canocial Path: "+f.getCanonicalPath());
            System.out.println("Parent :"+f.getParent());
            System.out.println("Exists:- "+f.exists());
            if(f.exists()){
                System.out.println("Is writable : "+f.canWrite());        
                System.out.println("Is readable: "+f.canRead());
                System.out.println("Is a Directory: "+f.isDirectory());
                System.out.println("Is a File: "+f.isFile());
                System.out.println("File Size in Bytes "+f.length());
            }

            }   
}
