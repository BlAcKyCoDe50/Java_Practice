//throwable is always at last means after catch
//Finnaly will only execute when we enter in the try if the Try will not exectue then the Finnaly will not Execute.

public class TestThrow1 {
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("not valid"); //it should be always the unchecked exception...
        // throw new java.io.IOException("not valid"); it will give the error 
        }
    else{
        System.out.println("welcome to vote");
    }
    
}
    public static void main(String[] args) {
        validate(15);
        System.out.println("rest of the code...");
    }
    
}
