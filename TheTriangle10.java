import java.util.Scanner;

public class TheTriangle10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numinput;
        int i = 0;
        String s = "";

        System.out.println("Input some number:");
        numinput = input.nextInt();
        
        for (i = 1; i <= numinput; i++) {
            s = s + "*";
            System.out.println(s);
            
        }

        input.close();
        }
    }

