import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temprature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to calsius or fahreheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // (condition)n ? ture : false

        newTemp = (unit.equals("C")) ? (temp -32) * 5 / 9 : (temp * 5 / 9) +32;

        System.out.printf("%.1f°%s", newTemp,unit);


        scanner.close();

     }
}