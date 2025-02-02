package ReverseNumOrString;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=scanner.nextInt();
        if(revNumber(num)){
            System.out.println("The number is palindrome..");
        }
        else{
            System.out.println("The number is not palindrome..");
        }
    }
    public static boolean revNumber(int num){
        int originalNum=num;
        int rem, rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return  rev==originalNum;
    }
}
