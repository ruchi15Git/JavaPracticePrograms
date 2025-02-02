package PracticeProgram30Jan;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Year: ");
        long year=scanner.nextLong();
        /* To check if a year is a leap year, you need to follow these rules:

A year is a leap year if it is divisible by 4.
However, if the year is divisible by 100, it is not a leap year, unless:
The year is also divisible by 400. If it is, then it is a leap year.
So, you'll need to use conditional statements to check for these divisibility rules.
You could start by checking for divisibility by 4, then handle the exception cases for divisibility by 100 and 400.
         */


    }
}
