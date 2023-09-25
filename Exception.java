public class Exception {
    public static void main(String[] args) {
       try{
        // int
         a=Integer.parseInt(args[0]);
        
       
        try{
        int c=a/0;
        
    }
    catch(ArithmeticException e){System.out.println("This is Arithematic Exception");}
    }
        
        catch(ArrayIndexOutOfBoundsException m){System.out.println("This is ArrayOutofBoundException");}
        System.out.println("Rest of the Code");
        }
    }

