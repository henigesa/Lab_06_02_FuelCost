
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        int gallonsInTank = 0;
        int fuelEfficiency = 0;
        int priceGas = 0;
        double costPer;
        double howFar;
        //prompt user to enter the variables
        System.out.println("How many gallons of gas are in your tank?");
        //take the user input
        if (input.hasNextInt()) {
            gallonsInTank = input.nextInt();
            input.nextLine();
        }
        else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        System.out.println("What is the fuel efficiency of your car in miles per gallon?");
        //take the user input
        if (input.hasNextInt()) {
            fuelEfficiency = input.nextInt();
            input.nextLine();
        }
        else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        System.out.println("What is the price of gas right now?");
        //take the user input
        if (input.hasNextInt()) {
            priceGas = input.nextInt();
            input.nextLine();
        }
        else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        //do math
        costPer = (100 / fuelEfficiency) * priceGas ;
        howFar = fuelEfficiency * gallonsInTank ;
        System.out.println("It will cost you $" + costPer + " to drive 100 miles.");
        System.out.println("You can drive " + howFar + " miles before you run out of gas.");
    }
}