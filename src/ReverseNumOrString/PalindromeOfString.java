package ReverseNumOrString;

import java.util.Scanner;

public class PalindromeOfString {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scanner.next();
        str=str.toLowerCase();
        String reverseString=reverseString(str);
        if(str.equals(reverseString)){
            System.out.println("The string is palindrome..");
        }else{
            System.out.println("The string is not a palindrome..");
        }

    }

    public static String reverseString(String str){
        String revStr="";
        for (int i=str.length()-1;i>=0;i--){
            revStr=revStr+str.charAt(i);
        }
        return revStr;
    }


}
