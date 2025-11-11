package Jobsheet11;
import java.util.Scanner;

public class CinemaWithScanner10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int row;
        int collumn;
        String name;
        String next;
        
        String[][] audience = new String[4][2];

        while(true) {
            System.out.print("Enter name: ");
            name = sc.nextLine();

            System.out.print("Enter row number: ");
            row = sc.nextInt();

            System.out.print("Enter collumn number: ");
            collumn = sc.nextInt();
            sc.nextLine();

            audience[row - 1][collumn - 1] = name;
            System.out.print("Are there any other audience? (yes/no): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("no")) {
                break;
            
            }
            
            sc.close();
        }




    }

}
