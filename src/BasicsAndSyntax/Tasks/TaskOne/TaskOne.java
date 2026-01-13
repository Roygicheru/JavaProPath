package BasicsAndSyntax.Tasks.TaskOne;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

    public static Double findMin(ArrayList<Double> list){

        double minimum = list.get(0);
        
        for (double currentNumber : list){
            if (currentNumber < minimum){
                minimum = currentNumber;
            }
        }
        return minimum;
    }

    public void mainTaskOne(){
        Scanner input = null;
        int taskNumber;
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

    public void otherTask(){

        var temperatures = new ArrayList<Double>();
        temperatures.add(65.2);
        temperatures.add(70.5);
        temperatures.add(58.4);
        temperatures.add(72.1);

        double minTemperature = findMin(temperatures);

            System.out.println("Minimum Temperature: " + minTemperature);
    }

    public void practiceTask(){
        // Set the maximum possible grade in the classroom grades to 100
        int maxGrade = 100;

        // The actual score of the user
        int userGrade= 80;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userGrade to double to make sure that the division is accurate */
        double percentage = (double) userGrade / maxGrade * 100.0d;

        // Print the result
        System.out.println("User's grade is: " + percentage);
    }
}
