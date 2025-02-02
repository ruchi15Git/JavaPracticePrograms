package ReverseNumOrString;

import java.util.Scanner;

public class ReverseANum {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int revNum= revNum(num);
        System.out.println("The reverse number is: "+revNum);
    }

    public static int revNum(int num){
        int rev=0, rem;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
}
