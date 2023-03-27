import java.util.Scanner;

class Amount {
    private double amount;

    public Amount(double amount) {
        this.amount = amount;
    }

    public double[] total() {
        double a1 = (75 * amount) / 100;
        double a2 = (25 * amount) / 100;
        double[] result = {a1, a2};
        return result;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = 0;
        try {
            amount = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        
        if (amount < 200 || amount > 4000) {
            System.out.println("Invalid Input");
            return;
        }
        
        Amount obj = new Amount(amount);
        double[] totalAmount = obj.total();
        System.out.printf("%.2f\n%.2f", totalAmount[0], totalAmount[1]);
    }
}
