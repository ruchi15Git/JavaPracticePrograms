package Task30Jan;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
               if(num%i==0){
                   isPrime=false;
                   break;
               }
            }
        }
        if(isPrime){
            System.out.println("The number is prime number..");
        }else{
            System.out.println("The number is not a prime number..");
        }


    }
}
