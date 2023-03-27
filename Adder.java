import java.util.Scanner;

public class Adder {
    
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    
    public void add(String s1, String s2) {
        System.out.println(s1 + s2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adder adder = new Adder();
        int choice = scanner.nextInt();
        if (choice == 1) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adder.add(a, b);
        } else if (choice == 2) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            adder.add(s1, s2);
        } else {
            System.out.println("ERROR");
        }
        scanner.close();
    }
}
