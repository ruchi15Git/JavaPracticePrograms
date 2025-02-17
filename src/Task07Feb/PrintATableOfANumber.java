package Task07Feb;

import java.util.Scanner;

public class PrintATableOfANumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println(num+" x "+i+" = "+mul);

        }
    }
}
