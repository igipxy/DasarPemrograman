package Jobsheet11;

import java.util.Scanner;

public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        System.out.print("Enter the number of courses: ");
        int numCourses = sc.nextInt();

        int[][] scores = new int[numStudents][numCourses];

        // Input scores for each student and course
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            for (int j = 0; j < numCourses; j++) {
                System.out.print("Course #" + (j + 1) + " score: ");
                scores[i][j] = sc.nextInt();
            }
        }

        // Calculate and display average for each student
        for (int i = 0; i < numStudents; i++) {
            double sumForStudent = 0;
            for (int j = 0; j < numCourses; j++) {
                sumForStudent += scores[i][j];
            }
            double averageStudent = sumForStudent / numCourses;
            System.out.println("Average score for student #" + (i + 1) + ": " + averageStudent);
        }

        // Calculate and display average for each course
        for (int j = 0; j < numCourses; j++) {
            double sumForCourse = 0;
            for (int i = 0; i < numStudents; i++) {
                sumForCourse += scores[i][j];
            }
            double averageCourse = sumForCourse / numStudents;
            System.out.println("Average score for course #" + (j + 1) + ": " + averageCourse);
        }

        sc.close();
    }
}