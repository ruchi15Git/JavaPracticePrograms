package Task9thFeb;

import java.util.Scanner;

public class LeftTriangleStartPattern {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int index=scanner.nextInt();
        for(int i=index;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
