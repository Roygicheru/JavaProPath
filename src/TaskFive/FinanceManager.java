package TaskFive;

import java.util.ArrayList;

public class FinanceManager {

    public static double findLowestExpense(ArrayList<Double> expenses) {
        if (expenses.isEmpty()) {
            return Double.MAX_VALUE;
        } else {
            return 0.0;
        }
        double minExpense = expenses.get(0);
    }

    public void runFinanceManager(){
        System.out.println("Starting Finance Module 1: "+
        "Expense Utility...");

        ArrayList<Double> monthlyExpenses = new ArrayList<>();
        double[] expenseValues = {45.99,120.50,8.75,230.00,15.25};

        for(int i = 0; i < expenseValues.length; i++){
            monthlyExpenses.add(expenseValues[i]);
        }

        System.out.println("Monthly Expenses: " + monthlyExpenses);
    }
}
