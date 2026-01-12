package JavaTestProjects;

public class JavaTestProjects1 {
    /* Digital Asset Tracker Project */
    /** 
     * This project tracks digital assets by declaring various variables
     * of different data types, performs calculations, and demonstrates
     * type casting in Java.
     * @author Roy Gicheru
     */
    public void digitalAssetTracker(){
        //Asset name declaration
        String assetName = "Bitcoin";
        //License key declaration
        String licenseKey = "XYZ-123-ABC-456";
        //Active status declaration
        boolean isActive = true;
        //Asset category declaration
        char assetCategory = 'C';
        //Unit price declaration
        double unitPrice = 30000.50;
        //Quantity purchased declaration
        int quantityPurchased = 2;
        //Total cost calculation
        double totalCost = unitPrice * quantityPurchased;
        //Type casting examples, estimating whole cost and converting quantity to double
        int estimatedWholeCost = (int) totalCost;
        double doubleQuantity = quantityPurchased;
        
        System.out.println("Asset Name: " + assetName);
        System.out.println("License Key: " + licenseKey);
        System.out.println("Is Active: " + isActive);
        System.out.println("Asset Category: " + assetCategory);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Quantity Purchased: " + quantityPurchased);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Estimated Whole Cost: $" + estimatedWholeCost);
        System.out.println("Double Quantity: " + doubleQuantity);
    }
    
    /* Automated Vending Machine Project */
    /**
     * This project is intended to simulate an automated vending machine.
     * It is meant to test skills in fundamental Java programming concepts.
     * @author Roy Gicheru
     */

    public void automatedVendingMachine(){
        String[] items = {"Soda", "Water", "Chips", "Cookies", "Candy"};
        double[] prices = {1.50, 1.00, 1.25, 1.75, 0.95};
        double cashInserted = 3.00;
        int itemSelection = 3; 
        final double MAX_REFUND_LIMIT = 5.00;

        System.out.println("\n***Vending Machine "+
        "Transaction Report***");
        System.out.println("\n--- Initialization ---");
        System.out.println("Cash Inserted: $" + cashInserted);
        System.out.println("Item Selected (Index): " + itemSelection);
        System.out.println("Item name: " + items[itemSelection]);
        System.out.println("Item Price: $" + prices[itemSelection]);
        System.out.println("Maximum refund limit: $" +
        MAX_REFUND_LIMIT + "\n");

        if(itemSelection >= 0 && itemSelection < 5 &&
            (cashInserted >= prices[itemSelection])) {
            
            System.out.println("--- Transaction Pre-Check ---");
            System.out.println("Selection confirmed: " +
            items[itemSelection] + " at $" +
            prices[itemSelection] + ".");
            System.out.println("Transaction approved. "+
            "Dispensing item...\n");

            System.out.println("--- Dispensing Simulation ---");
            for(int i = 0; i < items.length; i++) {
                if (i != itemSelection) {
                    System.out.println("Checking Slot " + i + 
                    " does not match selection. Skipping...");
                    continue;
                }
                System.out.println("--- Item Dispensed: " + items[i] + 
                " ---");
                System.out.println("Dispensing complete.\n");
                break;
            }

            double changeDue = cashInserted - prices[itemSelection];
            String refundStatus;

            System.out.println("--- Final Change and Refund Report ---");

            if (changeDue == (int) changeDue) {
                System.out.println("Change is a whole dollar amount.");
            } else {
                System.out.println("Change includes cents");
            }


            if (changeDue == 0.0) {
                refundStatus = "No Refund";
            }else if (changeDue <= 1.00){
                refundStatus = "Small Change";
            } else if (changeDue <= MAX_REFUND_LIMIT) {
                refundStatus = "Standard Refund";
            } else {
                refundStatus = "Limit Exceeded";
            }
            System.out.println("Change Due: $" + String.format("%.2f", changeDue));
            System.out.println("\nRefund Status: " + refundStatus + "\n");

            System.out.println("\n** CUSTOMER MESSAGE **");
            switch (refundStatus) {
                case "No Refund":
                    System.out.println("No change to dispense.");
                    break;
                case "Small Change":
                    System.out.println("Thank you! Your small change of $" + String.format("%.2f", changeDue) + " is being returned.");
                    break;
                case "Standard Refund":
                    System.out.println("Thank you! Your change of $" + String.format("%.2f", changeDue) + " is being returned now. Have a great day!");
                    break;
                case "Limit Exceeded":
                    System.out.println("Refund limit exceeded. "+
                    "Please contact support.");
                    break;
                default:
                    System.out.println("Unknown refund status.");
                    break;
            }

        } else {
            System.out.println("--- Transaction Pre-Check ---");
            System.out.println("Transaction failed. Invalid "+
            "selection or insufficient funds.");
            System.out.println("--- PROCESS TERMINATED ---\n");
            return;
        }
    }
}
