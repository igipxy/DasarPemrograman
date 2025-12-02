package Jobsheet10;
import java.util.Scanner;

public class CinemaWithScanner10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2]; // 4 rows, 2 columns
        int menu;

        while (true) {
            System.out.println("\n===== CINEMA MENU =====");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int row, column;

                    while (true) {
                        // Input and validate row
                        while (true) {
                            System.out.print("Enter row number (1-4): ");
                            row = sc.nextInt();
                            if (row >= 1 && row <= 4) break;
                            System.out.println("Invalid row! Please enter between 1 and 4.");
                        }

                        // Input and validate column
                        while (true) {
                            System.out.print("Enter column number (1-2): ");
                            column = sc.nextInt();
                            if (column >= 1 && column <= 2) break;
                            System.out.println("Invalid column! Please enter between 1 and 2.");
                        }

                        // Check if seat is occupied
                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("Seat already taken by " + audience[row - 1][column - 1]);
                            System.out.println("Please choose another seat.\n");
                        } else {
                            // Seat is free — assign it
                            audience[row - 1][column - 1] = name;
                            System.out.println("Successfully added audience: " + name);
                            break;
                        }
                    }
                    sc.nextLine(); // consume leftover newline
                    break;

                case 2:
                    System.out.println("\n===== AUDIENCE LIST =====");
                    System.out.println("(*** means empty seat)\n");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            String occupant = (audience[i][j] == null) ? "***" : audience[i][j];
                            System.out.print(occupant + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1-3.");
            }
        }
    }
}
