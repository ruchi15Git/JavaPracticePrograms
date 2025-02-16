package Task30Jan;

import java.util.Scanner;

public class GradeBasedCalculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=scanner.nextInt();
        String grade="";
        if(marks>=0 && marks<=100){
        if (marks>=90 && marks<=100){
            grade="A+";
        } else if (marks>=80 && marks<=89) {
            grade="A";
        } else if (marks>=70 && marks<=79) {
            grade="B";
        } else if (marks>=60 && marks<=69) {
            grade="C";
        } else if (marks>=50 && marks<=59) {
            grade="D";
        } else if (marks>=40 && marks<=49) {
            grade="E";
        }else {
            grade="Fail";
        }
        System.out.println("Your grade is: "+grade);
    }
    else{
        System.out.println("Please enter valid marks..");
        }}

}
