package Function;

import java.util.Scanner;

public class Test {
    // The ayam method now accepts a Scanner object as an argument
    public static void ayam(int spicyness, Scanner sc) {
        System.out.println("Cooking AYAM");
        System.out.println("spicyness level? ");
        // Call nextInt() on the passed Scanner object 'sc'
        int level = sc.nextInt();
        System.out.println("Final order : AYAM with spicyness level " + level);

    }

    // The bebek method now accepts a Scanner object as an argument
    public static void bebek(Scanner sc) {
        System.out.println("Making BEBEK");
        System.out.println("spicyness level? ");
        // Call nextInt() on the passed Scanner object 'sc'
        int level = sc.nextInt();
        System.out.println("Final order : BEBEK with spicyness level " + level);
    }

    public static void main(String[] args) {
        // Create the Scanner object once in the main method
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose (1. Ayam / 2. Bebek): ");
        int choice = sc.nextInt();
        if (choice == 1) {
            // Pass the Scanner object 'sc' when calling ayam
            ayam(1, sc);
        } else if (choice == 2) {
            // Pass the Scanner object 'sc' when calling bebek
            bebek(sc);
        } else {
            System.out.println("Invalid choice");
        }
        // It's good practice to close the scanner when you are done with it
        sc.close();
    }
}
