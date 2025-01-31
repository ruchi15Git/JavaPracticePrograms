package Programs;

import java.util.Scanner;

public class EvenOrOddNum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("The number is even number..");
        }else {
            System.out.println("The number is odd number..");
        }
    }
}
