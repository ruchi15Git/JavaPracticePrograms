package Arrays;

import java.util.Scanner;

public class UserInputOfAnArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size= scanner.nextInt();
        int [] array=new int[size];
        //to take the array inputs from user.
        for(int i=0;i<size;i++){
            System.out.println("Enter a number: ");
            array[i]=scanner.nextInt();
        }
        System.out.println("---------------------------");
        //to print the array on console
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
