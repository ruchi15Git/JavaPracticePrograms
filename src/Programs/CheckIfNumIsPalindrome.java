package Programs;

import java.util.Scanner;

public class CheckIfNumIsPalindrome {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number=scanner.nextInt();
    if (isNumberPalindrome(number)){
        System.out.println("The number is palindrome..");
    }else {
        System.out.println("The number is not palindrome..");
    }

    }

    public static boolean isNumberPalindrome(int number){

        int num=number;
        int rem, reverse=0;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        return number==reverse;
    }
}
