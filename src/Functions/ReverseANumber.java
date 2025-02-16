package Functions;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
       int reverseNumber= reversenum(num);
       System.out.println("Reversed number is: "+reverseNumber);

    }

    public static int reversenum(int originalNum){
        int rem,  revNum=0;
        while (originalNum!=0){
            rem=originalNum%10;
            revNum=revNum*10+rem;
            originalNum=originalNum/10;
        }
        return revNum;
    }

}
