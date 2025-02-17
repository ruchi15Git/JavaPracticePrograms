package Task07Feb;

import java.util.Scanner;
import java.util.SequencedCollection;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scanner.nextInt();
        boolean isPrime=true;
        if(number<=1){
            System.out.println("The number is not a prime number..");
            return;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
         if(number%i==0) {
             isPrime = false;
             break;
         }
        }
        if(isPrime){
            System.out.println("The number is a prime number..");
        }else{
            System.out.println("The number is not a prime number..");
        }
    }
}
