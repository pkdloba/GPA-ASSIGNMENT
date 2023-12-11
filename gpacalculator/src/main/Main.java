package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import utils.Table;
import models.CourseGrade;
import models.GradePointAttained;
import models.UnitAttained;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many courses do you offer: ");
        int numberOfCourses = getTotalCourse();

        String[][] courseProfile = new String[numberOfCourses][3];
        for (int i = 0; i < numberOfCourses; i++) {
            String[] newProfile = new String[1];
            newProfile = getCourseProfile(i + 1);
            courseProfile[i] = newProfile;
        }
        
        String[][] gradedCourseProfile = CourseGrade.getGrade(courseProfile);
        String[][] gradedUnitCourseProfile = UnitAttained.getUnitAttained(gradedCourseProfile);
        double gradePointAverage = GradePointAttained.getGradePointAttained(gradedUnitCourseProfile);

        Table.printTable(gradedUnitCourseProfile);

        String formattedGPA = String.format("%.2f", gradePointAverage);
        System.out.printf("\n\nYour GPA is = %s to 2 decimal places.\n", formattedGPA);

        scanner.close();
    }

    private static int getTotalCourse() {
        int numberOfCourses = 0;
        try {
            numberOfCourses = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Kindly insert a number not letters or alphabets");
            scanner.nextLine();
            numberOfCourses = getTotalCourse();
        }
        return numberOfCourses;
    }
    
    private static String[] getCourseProfile(int index) {
        String[] courseProfile = new String[3];
        String courseName = "";
        int courseCredit = 0;
        int score = 0;

        try {

            System.out.println("Enter the name of course " + index + ": ");
            if (scanner.hasNextLine()) {
                courseName = scanner.nextLine();
            }

            System.out.println("Enter the credit unit: ");
            while (!scanner.hasNextInt()) {
                System.err.println("kindly input a number not alphabet or symbol.");
                scanner.nextLine();
            }
            courseCredit = scanner.nextInt();
            scanner.nextLine();
            while (courseCredit <= 0) {
                System.err.println("Kindly insert a course credit greater than zero");
                courseCredit = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.println("Enter the score attained: ");
            while (!scanner.hasNextInt()) {
                System.err.println("Kindly input a valid score");
                scanner.nextLine();
            }
            score = scanner.nextInt();
            scanner.nextLine();
            while (score < 0 || score > 100) {
                System.err.println("Kindly insert a score within 0 and 100");
                score = scanner.nextInt();
                scanner.nextLine();
            }

            // // passing values to the courseprofile array
            courseProfile[0] = courseName;
            courseProfile[1] = String.valueOf(courseCredit); //String.valueOf method helps to typecast an int to string
            courseProfile[2] = String.valueOf(score);
        } catch (InputMismatchException e) {
            System.err.println("Kindly input correct details");
            getCourseProfile(index);
        }

        return courseProfile;
    }
}