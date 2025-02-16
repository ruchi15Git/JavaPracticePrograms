package Task31Jan;

import java.util.Scanner;

public class CheckIfANumberIsPalindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number=scanner.nextInt();
        int reverseNum=0;
        int rem;
        int originalNum=number;
        while(number!=0){
            rem=number%10;
            reverseNum=reverseNum*10+rem;
            number=number/10;
        }
        if(originalNum==reverseNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome..");
        }
    }
}
