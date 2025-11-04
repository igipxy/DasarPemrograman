import java.util.Scanner;

public class arrayAverageScore10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 4: Create array and variables
        int[] score = new int[10];
        double total = 0;
        double average;
        
        // Step 5: Input scores
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }
        
        // Step 6: Calculate total
        for (int i = 0; i < score.length; i++) {
            total += score[i];  // Add each score to total
        }
        
        // Step 7: Calculate average
        average = total / score.length;
        System.out.println("The class average score is " + average);

        // Add this after calculating the average (or anywhere after input)

        int passedCount = 0;
        for (int i = 0; i < score.length; i++) {
        if (score[i] > 70) {
        passedCount++;  // Increase count for each passing student
            }
        }

        System.out.println("Number of students who passed: " + passedCount);
        
        sc.close();
    }
}

