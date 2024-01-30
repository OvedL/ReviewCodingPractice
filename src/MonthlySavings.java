import java.util.Scanner;

public class MonthlySavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MONTHLY_RATE = 0.05/12;

        System.out.println("Enter the monthly saving amount:");
        int savings = input.nextInt();

        double previousValue = 0;

        for(int i = 1; i<= 6; i++){
            double monthlyValue = (previousValue + savings) * (1 + MONTHLY_RATE);
            previousValue = monthlyValue;
            System.out.println("Month " + i + ": " + String.format("%.2f", monthlyValue));
        }

        input.close();
    }
}
