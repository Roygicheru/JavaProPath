package TaskOne;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

    public void mainTaskOne(){
        Scanner input = null;
        int taskNumber = 0;
        try {
            input = new Scanner(System.in);
            System.out.print("Please provide your task number: ");
            taskNumber = input.nextInt();

            if (taskNumber >= 1 && taskNumber < 5) {
                System.out.println("Keep working hard! You are on task " + taskNumber + ".");
            } else {
                System.out.println("Great job! You are moving into the expert level with task " + taskNumber + ".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Please provide a whole number.");
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
