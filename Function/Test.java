package Function;

import java.util.Scanner;

public class Test {
    public static void ayam(int spicyness, Scanner sc) {
        System.out.println("Cooking AYAM");
        System.out.println("spicyness level? ");
        int level = sc.nextInt();
        System.out.println("Final order : AYAM with spicyness level " + level);
        
    }

    public static void bebek(Scanner sc) {
        System.out.println("Making BEBEK");
        System.out.println("spicyness level? ");
        int level = sc.nextInt();
        System.out.println("Final order : BEBEK with spicyness level " + level);
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Choose (1. Ayam / 2. Bebek): ");
        int choice = sc.nextInt();
        if (choice == 1) {

            ayam(1, sc);
        } else if (choice == 2) {
            bebek(sc);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
