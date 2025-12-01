package TaskOne;
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

        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(65.2);
        temperatures.add(70.5);
        temperatures.add(58.4);
        temperatures.add(72.1);

        double minTemperature = findMin(temperatures);

            System.out.println("Minimum Temperature: " + minTemperature);
    }

    public void practiceTask(){
        String name = "Roy";
        System.out.print("The number you've chosen, " + name + ", is: ");
        System.out.println(3 + 3);
        System.out.println("10" + 5);
    }
}
