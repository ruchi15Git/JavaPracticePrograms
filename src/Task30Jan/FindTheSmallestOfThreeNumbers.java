package Task30Jan;

import java.util.Scanner;

public class FindTheSmallestOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if(num1<=num2 && num1<=num3){
            System.out.println("The smallest number is: "+num1);
        } else if (num2<=num1 && num2<=num3) {
            System.out.println("The smallest number is: "+num2);
        }else{
            System.out.println("The smallest number is: "+num3);
        }
    }
}
