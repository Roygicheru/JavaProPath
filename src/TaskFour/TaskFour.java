package TaskFour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFour {
    public void mainTaskFour(){
        Scanner input = null;

        try {
            input = new Scanner(System.in);
            System.out.println("Starting challenge 7: While Loops and Averaging...");
        } 
        catch (InputMismatchException e) {
            
        }
        finally {
            if (input != null) {
                System.out.println("Scanner resource successfully closed.");
                input.close();
            }
        }
    }
}
