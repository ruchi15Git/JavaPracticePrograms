package Programs;

import java.util.Scanner;

public class CharIsConsonentOrVowel {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch=scanner.next().charAt(0);
        char lowerch=Character.toLowerCase(ch);
        if(lowerch=='a'||lowerch=='e'||lowerch=='i'||lowerch=='o'||lowerch=='u'){
            System.out.println("The entered char "+ch+" is vowel");
        }else if(lowerch>='a' &&lowerch<='z'){
            System.out.println("The entered char "+ch+" is consonent");
        }
    }
}
