package TaskThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskThree {
    public void MainTaskSix(){

        Scanner input = null;
        int count = 0;
        int totalSum = 0;
        
        System.out.println("Starting challenge 6: Dynamic Input and Stupid Test...");

        try{
            input = new Scanner(System.in);

            System.out.print("How many numbers wil you enter? ");

            count = input.nextInt();
            
        } 
        catch(InputMismatchException e){
            System.out.println("Error: Please enter a whole number for the count.");
            count = -1;
        }

        finally {
            if (input != null) {
                input.close();
                System.out.println("Scanner resource successfully closed.");
            }
        }
    }
}
