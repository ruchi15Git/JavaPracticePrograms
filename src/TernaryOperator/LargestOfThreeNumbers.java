package TernaryOperator;
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        /*int a=1000,b=2000,c=300;
        boolean exp1=a>b;
        boolean exp2=b>c;*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of A, B & C: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        String result=a>b?"A is the largest":b>c?"B is the largest":"C is the largest";
        System.out.println(result);
    }
}
