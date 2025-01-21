package TernaryOperator;
import java.util.Scanner;

//add two numbers if first number is greater than second . if not subtract
public class TernaryOperatorOnArithmeticOperatr {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        //System.out.println("Enter first number: ");
        int num1=input.nextInt();
        //System.out.println("Enter second number: ");
        int num2=input.nextInt();
        int result=(num1>=num2)?(num1+num2):(num1-num2);
        System.out.println(result);
    }
}
