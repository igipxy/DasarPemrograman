package Assignment;

import java.util.Scanner;

public class CafeSearch10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // menu that i make
        String[] menu = {
            "Fried Rice", "Fried Noodles", "Toasted Bread", 
            "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice", "Teh Aselole"
        };
        
        // display available menu
        System.out.println("=== AVAILABLE MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        
        // Input search item
        System.out.print("Enter the item you want to search for: ");
        String searchItem = sc.nextLine();
        
        // Linear search
        boolean found = false;
        int position = -1;
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchItem)) {
                found = true;
                position = i;
                break;
            }
        }
        
        // Display search results
        if (found) {
            System.out.println("The " + searchItem + "' is available on the menu! (Position: " + (position + 1) + ")");
        } else {
            System.out.println("The " + searchItem + "' is not on the menu.");
        }
        
        sc.close();
    }
}
