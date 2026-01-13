package BasicsAndSyntax.HabitHarvest;

public class HabitHarvest {
    public void mainLogic(){
        /* For now, I'll focus on the main categories first.
        Under expenses, I can break it down further into 
        essentialExpenses and discretionaryExpenses*/

        int monthlyIncome = 10000;
        int essentialExpenses = 3000;
        int discretionaryExpenses = 3000;
        int totalExpenses = essentialExpenses + discretionaryExpenses;
        int surplus = monthlyIncome - totalExpenses;
        int halfIncome = monthlyIncome / 2;
        // int investments = 4500;
        // int emergencyFund = 1000;
        // int pensionContributions = 500;

        if (totalExpenses > monthlyIncome) {

            System.out.println("Warning: Budget exceeds income!");

        } else {
            
            if (totalExpenses > halfIncome) {
                System.out.println("Consider reducing total expenses.");
            } else {
                System.out.println("Monthly Income: $" + monthlyIncome);
                System.out.println("Total Expenses: $" + totalExpenses);
                System.out.println("Surplus: $" + surplus);
            }
            
        }
    }
}
