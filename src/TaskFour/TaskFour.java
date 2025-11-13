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
        } 
        catch (InputMismatchException e) {
            
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
