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
        if (count > 0) {
            double average = totalSum / count;
            System.out.println("The total sum of scores is: " + totalSum);
            System.out.println("Number of valid scores entered: " + count);
            System.out.println("The average score is: " + average);
        } else if (count == 0) {
            System.out.println("No valid scores were entered.");
        }
    }
}
