package PracticeProgram30Jan;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = scanner.nextInt();
        if (marks >= 1 && marks <= 100) {
            System.out.println("Grade based on marks is: "+gradeMethod(marks));
        } else {
            System.out.println("Enter valid marks..");
            System.exit(0);
        }
    }

    public static String gradeMethod(int marks) {
        String grade = "";
        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 80 && marks <= 89) {
            grade = "A";
        } else if (marks >= 70 && marks <= 79) {
            grade = "B";
        } else if (marks >= 60 && marks <= 69) {
            grade = "C";
        } else if (marks >= 50 && marks <= 59) {
            grade = "D";
        } else if (marks >= 40 && marks <= 49) {
            grade = "E";
        } else {
            grade = "Fail";
        }


        return grade;

    }
}