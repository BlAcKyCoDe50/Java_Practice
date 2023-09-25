import java.util.*;





public class Test {
    static String input;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        input = sc.nextLine();
        int str_length= input.length();
        String[] arr=new String[str_length];
        arr=input.split(input);
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }    

    }

    
}


