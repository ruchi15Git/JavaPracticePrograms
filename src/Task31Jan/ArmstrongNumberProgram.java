package Task31Jan;

import java.util.Scanner;

public class ArmstrongNumberProgram{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number=scanner.nextInt();
        int digitCount=0;
        int originalNumber=number;
        int rem, sumofDigits=0;
        while(number!=0){
           number= number/10;
           digitCount++;
        }
        number=originalNumber;
      while(number!=0){
          rem=number%10;
          sumofDigits=sumofDigits+(int)Math.pow(rem,digitCount);
          number=number/10;
      }
      if(sumofDigits==originalNumber){
          System.out.println("Armstrong number..");
      }else {System.out.println("Not an Armstrong number..");}
    }

}
