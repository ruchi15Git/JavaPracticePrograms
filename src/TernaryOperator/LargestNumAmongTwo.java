package TernaryOperator;
import java.util.Scanner;

public class LargestNumAmongTwo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        int result=(num1>num2)?num1:num2;
        System.out.println("largest number is: "+result);
    }
}
