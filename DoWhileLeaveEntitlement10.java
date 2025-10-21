import java.util.Scanner;

public class DoWhileLeaveEntitlement10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int leaveEntitlement = 0;
        int numLeave = 0;
        String confirmation = "null";

        do {
            System.out.println("Do you want to take leave? (yes/no): ");
            confirmation = input.next();
            
            if(confirmation.equalsIgnoreCase("yes")){
                System.out.println("how many days?: ");
                numLeave = input.nextInt();

                if(numLeave <= leaveEntitlement){
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                }else{
                    System.out.println("Invalid! You only have " + leaveEntitlement + " days available.");
                    System.out.println("Please enter a number between 1 and " + leaveEntitlement);
                    
                }
            }
        }while(leaveEntitlement > 0);
        System.out.println("You have used all your leave entitlement.");
    }

}
