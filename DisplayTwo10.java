import java.util.Scanner;

public class DisplayTwo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = 1; i <= numInput / 2; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }

        input.close();  
    }
}
