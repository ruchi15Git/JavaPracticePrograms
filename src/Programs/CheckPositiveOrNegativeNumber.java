package Programs;
import java.util.Scanner;

public class CheckPositiveOrNegativeNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        if(num>=0){
            System.out.println("The number is a positive number");
        }
        else {
            System.out.println("The number is a negative number.");
        }
    }
}
