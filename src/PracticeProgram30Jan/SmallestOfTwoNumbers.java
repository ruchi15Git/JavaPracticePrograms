package PracticeProgram30Jan;

import java.util.Scanner;

public class SmallestOfTwoNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1==num2){
            System.out.println("both are equal.");
        }else{
        if(num1<num2){
            System.out.println(num1+ " is smaller.");
        }else{
            System.out.println(num2+ " is smaller.");
        }
    }}
}
