package Assignment;
import java.util.Scanner;

public class studentGrade10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        // Input number of students 
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();


        //array and variables to store grades, total, highest, and lowest
        int[] grades = new int[numStudents];
        double total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        // Input grades and calculate running totals
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            
            // Add to total
            total += grades[i];
            
            // Check for highest/lowest
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        
        // Calculate average
        double average = total / numStudents;
        
        // Display results
        System.out.println("GRADE REPORT");
        System.out.println("All grades: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        
        sc.close();
    }
}