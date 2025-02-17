package Task01Feb;

import java.util.Scanner;

public class DivisibilityBy5And11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number=scanner.nextLong();
        if(number%5==0 && number%11==0){
            System.out.println("The number "+number+" is divisible by 5 & 11 ");
        }else{
            System.out.println("The number "+number+" is not divisible by 5 & 11 ");
        }
    }
}
