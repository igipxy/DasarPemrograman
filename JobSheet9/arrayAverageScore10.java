import java.util.Scanner;

public class arrayAverageScore10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] score = new int[numStudents];
        double totalPassed = 0, totalFailed = 0;
        int countPassed = 0, countFailed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                totalPassed += score[i];
                countPassed++;
            } else {
                totalFailed += score[i];
                countFailed++;
            }
        }

        if (countPassed > 0) {
            double averagePassed = totalPassed / countPassed;
            System.out.println("The average score of students who passed is " + averagePassed);
        } else {
            System.out.println("No students passed!");
        }

        if (countFailed > 0) {
            double averageFailed = totalFailed / countFailed;
            System.out.println("The average score of students who failed is " + averageFailed);
        } else {
            System.out.println("No students failed!");
        }

        sc.close();
    }
}