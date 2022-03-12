import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in); // Initialize scanner.

        System.out.print("Enter first operand: ");
        double firstOp = scan.nextDouble(); // Get first operand as a double.
        System.out.println("Enter second operand: ");
        double secOp = scan.nextDouble(); // Get second operand as a double.

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println();
        System.out.print("Which operation do you want to perform? ");

        int opSelect = scan.nextInt(); // Get the user's choice of operation as an integer.
        System.out.println();

        if (opSelect < 1 || opSelect > 2) {
            System.out.print("Error: Invalid selection! Terminating program.");
            return;
        }

        switch(opSelect) {
            case 1:
                System.out.print("The result of the operation is " + (firstOp + secOp) + ". Goodbye!");
                break;
            case 2:
                System.out.print("The result of the operation is " + (firstOp - secOp) + ". Goodbye!");
                break;
        }

    }
}