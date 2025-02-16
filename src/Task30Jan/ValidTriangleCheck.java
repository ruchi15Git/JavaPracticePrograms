package Task30Jan;

import java.util.Scanner;

public class ValidTriangleCheck {
    public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the three sides: ");
       int side1= scanner.nextInt();
       int side2= scanner.nextInt();
       int side3= scanner.nextInt();
       if(side1<=0||side2<=0||side3<=0){
           System.out.println("Invalid triangle..");
        }
        else if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            System.out.println("Valid triangle..");
       }else{
            System.out.println("Invalid triangle..");
       }
    }
}
