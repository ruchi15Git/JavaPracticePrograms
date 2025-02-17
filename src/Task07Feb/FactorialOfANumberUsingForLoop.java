package Task07Feb;

import java.util.Scanner;

public class FactorialOfANumberUsingForLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number=scanner.nextInt();
        long factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
System.out.println(factorial);
    }
}
