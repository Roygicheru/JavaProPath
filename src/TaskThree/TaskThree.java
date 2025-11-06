package TaskThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskThree {
    public void mainTaskSix(){

        Scanner input = null;
        int count = 0;
        int totalSum = 0;
        
        System.out.println("Starting challenge 6: Dynamic Input and Stupid Test...");

        try{
            input = new Scanner(System.in);

            System.out.print("How many numbers wil you enter? ");

            while (true) {
                try{
                   count = input.nextInt();
                   
                   if (count >= 1 && count < 100){
                    break;
                   }
                   else{
                    System.out.println("Please enter a number between 1 and 100: ");
                   }
                }
                catch(InputMismatchException e){
                    System.out.println("Invalid input. Please enter a valid whole number");
                    input.next();
                }
            }

            for(int i = 0; i < count; i++){
                try{
                    System.out.print("Enter number " + (i + 1) + " of " + count + ": ");
                    int number = input.nextInt();

                    if (number <= 0 || number > 100) {
                        System.out.println("Error: Please enter a positive whole number only, which is greater than 0 and less than 101.");
                        i--;
                        continue;
                    }

                    totalSum += number;
                }
                catch(InputMismatchException e){
                    System.out.println("Invalid input. Please enter a valid whole number");
                    input.next();
                    i--;
                }
            }

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

        System.out.println("The total sum is: " + totalSum);

    }
}
