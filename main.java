import java.util.Scanner;
public class main {
    public static void main(String[] argc) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1; convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.print("choose an option: ");
        choice = scanner.nextInt();

        if(choice ==1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight *  0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        if(choice ==2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight *  2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else{
            System.out.println(" That was not a valid choice");
        }
        scanner.close();

    }
}