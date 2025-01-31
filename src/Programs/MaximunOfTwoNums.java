package Programs;

import java.util.Scanner;

public class MaximunOfTwoNums {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2=scanner.nextInt();
        if(num1==num2){
            System.out.println("Both the numbers are equal.");
        }else{
        if(num1>num2){
            System.out.println("num1= "+num1+" is greater");
        }else {
            System.out.println("num2= "+num2+" is greater");
        }}
    }
}
