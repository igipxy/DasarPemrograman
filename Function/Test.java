package Function;

import java.util.Scanner;

public class Test {
    public static void ayam() {
        System.out.println("Cooking AYAM");

    }

    public static void bebek() {
        System.out.println("Making BEBEK");
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose (1. Ayam / 2. Bebek): ");
        int choice = sc.nextInt();
        if (choice == 1) {
            ayam();
        } else if (choice == 2) {
            bebek();
        } else {
            System.out.println("Invalid choice");
        }   
    }

}
