import java.util.Scanner;
public class main{
    public static void main(String[] argc){

        // compound interest calculator

        Scanner scanner = new Scanner (System.in);

        double principal;
        double rate;
        int timescompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timescompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timescompounded, timescompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();

    }
}