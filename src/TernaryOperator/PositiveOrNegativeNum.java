package TernaryOperator;
import java.util.Scanner;


public class PositiveOrNegativeNum {
    public static void main(String[] args){
        //int num=-7;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        String result=(num>=0)?"Positive number":"Negative number.";
        System.out.println(result);
    }
}
