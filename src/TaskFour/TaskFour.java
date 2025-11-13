package TaskFour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFour {
    public void mainTaskFour(){
        Scanner input = null;
        double totalSum = 0.0;
        int count = 0;
        int score = 0;

        try {
            input = new Scanner(System.in);
            System.out.println("Starting challenge 7: "+
            "While Loops and Averaging...");
            System.out.println("Initial totalSum: " + totalSum);
            System.out.println("Initial count: " + count);

            while (score != -1) {
                try {
                System.out.print("Enter a score "+
                "(or -1 to quit): ");
                score = input.nextInt();
                if (score != -1 && score >= 1 && score <= 100) {
                    totalSum += score;
                    count++;
                    System.out.println("Score entered: " + totalSum);
                } else if (score != -1 && (score < 1 || score > 100)) {
                    System.out.println("Invalid input. Please enter a "+
                    "positive score only...upto 100, or -1 to quit.");
                    continue;
                }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer score or -1 to quit.");
                    input.next(); // Clear the invalid input
                    continue;
                }
            }
        } 
        finally {
            if (input != null) {
                System.out.println("Scanner resource"+
                " successfully closed.");
                input.close();
            }
        }
    }
}
