package Task9thFeb;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int index=scanner.nextInt();
        for(int i=1;i<=index;i++){
            for(int k=1;k<=index-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
