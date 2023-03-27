import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two digit number: ");
        int num = sc.nextInt();
        sc.close();

        if (num < 10 || num > 99) {
            System.out.println("invalid input");
        } else {
            int sum = (num / 10) + (num % 10);
            int product = (num / 10) * (num % 10);
            int value = sum + product;
            if (value == num) {
                System.out.println("special two digit number");
            } else {
                System.out.println("not a special two digit number");
            }
        }
    }
}