package Tasks.ChallengeNine;

import java.util.ArrayList;

public class DataProcessor {
    public void runDataProcessor(){
        var monthlyExpenses = new ArrayList<Double>();
        
        double[] expenseValues = {45.99,120.50,8.75,230.00,15.25};

        int passingCondition = 100;

        for(int i = 0; i < expenseValues.length; i++){
            
            monthlyExpenses.add(expenseValues[i]);
        }

        System.out.println("--- Monthly Expenses Report ---");

        for(int i = 0; i < monthlyExpenses.size(); i++){

            double currentExpense = monthlyExpenses.get(i);
            
            if (currentExpense > passingCondition){
                System.out.println("Expense " + (i) + 
            ": " + monthlyExpenses.get(i));
            }
        }

        System.out.println("-------------------------------");
    }
}
