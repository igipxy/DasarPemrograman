package Assignment;

import java.util.Scanner;

public class foodAndBeveragesOrder10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int numOrders = sc.nextInt();
        sc.nextLine(); 

        String[] orderNames = new String[numOrders];
        double[] orderPrices = new double[numOrders];
        double totalCost = 0;

        for (int i = 0; i < numOrders; i++) {
            System.out.println("Order " + (i + 1) + ":");
            System.out.print("Enter food/drink name: ");
            orderNames[i] = sc.nextLine();
            System.out.print("Enter price: ");
            orderPrices[i] = sc.nextDouble();
            sc.nextLine(); 

            totalCost += orderPrices[i];
        }

        System.out.println("\n=== ORDER SUMMARY ===");
        for (int i = 0; i < numOrders; i++) {
            System.out.println((i + 1) + ". " + orderNames[i] + " - Rp." + orderPrices[i]);
        }
        System.out.println("Total Cost: Rp." + totalCost);
        
        sc.close();
    
    }
}
