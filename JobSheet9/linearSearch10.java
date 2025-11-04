import java.util.Scanner;

public class linearSearch10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of elements
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();
        
        // Create array and input elements
        int[] arrayInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        
        // Input search key
        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();
        
        // Linear search
        int result = -1; // Initialize with -1 (not found)
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }
        
        // Display result
        System.out.println("The key in the array is located at index position " + result);
        
        sc.close();
    }
}