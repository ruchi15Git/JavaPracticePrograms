package Task30Jan;

import java.util.Scanner;

public class CheckIfTheCharacterIsAnAlphabet {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=scanner.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("The character is an alphabet..");
        }else {
            System.out.println("The character is not an alphabet..");
        }
    }
}
