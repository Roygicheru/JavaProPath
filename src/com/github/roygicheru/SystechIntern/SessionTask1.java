package com.github.roygicheru.SystechIntern;

import java.util.Scanner;

public class SessionTask1 {
    public void simpleTask() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number or Enter 0 to exit: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            }
            
            int mynumber = scanner.nextInt();
            scanner.nextLine(); // Clear the "Enter" key buffer


            while (true){
            System.out.println("Type \"double\" to double the number. Type \"triple\" to square the number,");
            System.out.println("or type \"new\" to enter a new number and \"exit\" to quit.");
            String action = scanner.nextLine().toLowerCase();

            if (action.equals("exit")) {
                System.out.println("Thankyou for using the program. Goodbye!");
                scanner.close();
                return; // Exits the entire method
            } else if (action.equals("new")) {
                System.out.println("Returning to number entry...");
                break; // Breaks the INNER loop to go back to the top of the OUTER loop
            }

            switch (action) {
                case "double":
                    System.out.println("Result: " + (mynumber * 2));
                    break;
                case "triple":
                    System.out.println("Result: " + (mynumber * mynumber));
                    break;
                default:
                    System.out.println("Invalid action.");
                    break;
            }
        }
        }
    }

    public void exercise1() {
        Scanner scanner = new Scanner(System.in);

        // OUTER LOOP: For entering the two numbers
        while (true) {
            System.out.println("\n==============================");
            System.out.println("   STEP 1: ENTER NUMBERS");
            System.out.println("==============================");

            // Validate First Number
            System.out.print("Enter First number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); 
            }
            int num1 = scanner.nextInt();

            // Validate Second Number
            System.out.print("Enter Second number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            }
            int num2 = scanner.nextInt();
            scanner.nextLine(); // Clear the "Enter" key buffer

            // INNER LOOP: For performing multiple operations on the SAME numbers
            while (true) {
                try {
                    System.out.println("\n--- Current Numbers: [" + num1 + "] and [" + num2 + "] ---");
                    System.out.println("Choose: sum, difference, product, quotient, remainder");
                    System.out.println("OR: 'new' (for different numbers) | 'exit' (to quit)");
                    System.out.print("Action: ");
                    
                    String operation = scanner.next().toLowerCase();

                    // Navigation Logic
                    if (operation.equals("exit")) {
                        System.out.println("Closing calculator. Goodbye!");
                        scanner.close(); // Clean up resources
                        return; // Exits the entire method
                    }

                    if (operation.equals("new")) {
                        System.out.println("Returning to number entry...");
                        break; // Breaks the INNER loop to go back to the top of the OUTER loop
                    }

                    // Calculation Logic
                    switch (operation) {
                        case "sum":
                            System.out.println(">>> RESULT: " + (num1 + num2));
                            break;
                        case "difference":
                            System.out.println(">>> RESULT: " + (num1 - num2));
                            break;
                        case "product":
                            System.out.println(">>> RESULT: " + (num1 * num2));
                            break;
                        case "quotient":
                            if (num2 == 0) {
                                System.out.println(">>> ERROR: Division by zero is not allowed.");
                            } else {
                                // Cast to double for precision
                                System.out.println(">>> RESULT: " + ((double) num1 / num2));
                            }
                            break;
                        case "remainder":
                            if (num2 == 0) {
                                System.out.println(">>> ERROR: Cannot find remainder when dividing by zero.");
                            } else {
                                System.out.println(">>> RESULT: " + (num1 % num2));
                            }
                            break;
                        default:
                            System.out.println(">>> Unknown operation. Please try again.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                    scanner.nextLine(); // Safety flush
                }
            } // End Inner Loop
        } // End Outer Loop
    }

    public void internshipTask(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        scanner.close();
    }
}
