package Task07Feb;

import java.util.Scanner;

public class FactorialOfANumberUsingWhileLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scanner.nextInt();
        int i=1;
        long factorial=1;
        while(i<=number){
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial of "+number+" is:"+factorial);

    }
}
