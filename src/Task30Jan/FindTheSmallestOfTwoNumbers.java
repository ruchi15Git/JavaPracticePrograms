package Task30Jan;

import java.util.Scanner;

public class FindTheSmallestOfTwoNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1>num2){
            System.out.println("The smallest number is: "+num2);
        }else{
            System.out.println("The smallest number is: "+num1);
        }
    }
}
