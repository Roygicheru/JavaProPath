package TaskTwo;

public class TaskTwo {
    public void mainTaskTwo(){
        int[] taskScores = {10, 8, 9, 7, 6};
        int totalScore = 0;

        for (int i = 0; i < taskScores.length; i++) {
            totalScore += taskScores[i];
        }

        System.out.println("The sum is: " + totalScore);
    }
}
