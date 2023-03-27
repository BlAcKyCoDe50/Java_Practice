//for exception doesn't occur
//For each try block there can be zero or more catch blocks,but only one finally block.
//We can't write Try alone it can be written with CATCH or FINNALLY but can't written alone.
// Exception e will handle all the Exceptions.
// Keyword	Description
// try	The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.
// catch	The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
// finally	The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.
// throw	The "throw" keyword is used to throw an exception.
// throws	The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.
//**If there is not Catch block then the JVM will handle it */

// *CHECKOUT THE SLIDE**
public class TestFinallyBlock {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        try{
            
            int data=a/b;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println("I am Handling the exception");}
        catch(ArithmeticException e){System.out.println("I am handling the Arithematic exception");}
        catch(Exception e){System.out.println("I am handling all the exception"+e);}
       
        finally{System.out.println("Finally block always executed");}
        System.out.println("rest of the code....");
    
    
    }
    
    
    
}
