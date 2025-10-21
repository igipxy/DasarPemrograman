
import java.util.Scanner;
 
public class ForMultipliesNoAbsen {
    public static void main(String[] args){
        
        try (Scanner input = new Scanner(System.in)) {
            int multiple, sum = 0, counter = 0;
            System.out.print("input multiple: ");
            multiple = input.nextInt();
            for(int i = 1; i <= 50; i++){
                if(i % multiple == 0) {
                    sum = sum + i;
                    counter++;
                }
            }   System.out.printf("There are %d number that are multiples of %d in range 1 to 50. %n", counter, multiple);
            System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. %n", multiple, sum);
            double average = (counter == 0) ? 0.0 : (double) sum / counter;
            System.out.printf("Average of multiples is: %.2f%n", average);
        }
    }
    
}
