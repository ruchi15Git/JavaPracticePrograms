package ReverseNumOrString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=scanner.next();
        str=str.toLowerCase();
        System.out.println("Reverse string is: "+reverseString(str));

    }

    public static String reverseString(String str){
        String revString="";
        for (int i=str.length()-1;i>=0;i--){
            revString=revString+str.charAt(i);
        }
        return revString;
    }
}
