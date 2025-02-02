package PracticeProgram30Jan;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int largeNum=num1;
        if(num2>largeNum){
            largeNum=num2;
        }
        if(num3>largeNum){
            largeNum=num3;
        }
        System.out.println("The largest number is: "+largeNum);
    }
}
