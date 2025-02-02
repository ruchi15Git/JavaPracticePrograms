package PracticeProgram30Jan;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        int smallestNum=num1;
        if(num2<smallestNum){
           smallestNum=num2;
        }
        if(num3<smallestNum){
            smallestNum=num3;
        }
        System.out.println("The smallest number is: "+smallestNum);
    }
}
