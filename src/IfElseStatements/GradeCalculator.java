package IfElseStatements;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
       /* Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/
        char grade;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=scanner.nextInt();
       /* if(marks>=0 && marks<=100){
        if(marks>=90 && marks<=100){
            grade='A';
            System.out.println("Your grade is: "+grade);
        } else if (marks>=80 && marks<=89) {
            grade='B';
            System.out.println("Your grade is: "+grade);
        } else if (marks>=70 && marks<=79) {
            grade='C';
            System.out.println("Your grade is: "+grade);
        } else if (marks>=60 && marks<=69) {
            grade='D';
            System.out.println("Your grade is: "+grade);
        }else {
            grade='F';
            System.out.println("Your grade is: "+grade);
        }}else{
            System.out.println("Please enter valid marks: ");
        }
*/

        //to optimise the use of System.out.println("Your grade is: "+grade);
        if(marks>=0 && marks<=100){
            if(marks>=90 && marks<=100){
                grade='A';
            } else if (marks>=80 && marks<=89) {
                grade='B';
            } else if (marks>=70 && marks<=79) {
                grade='C';
            } else if (marks>=60 && marks<=69) {
                grade='D';
            }else {
                grade='F';
            }
            System.out.println("Your grade is: "+grade);
        }else{
            System.out.println("Please enter valid marks: ");
        }
    }
}
