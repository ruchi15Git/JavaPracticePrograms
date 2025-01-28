package Programs;

import java.util.Locale;

public class StringPalindrome {
    public static void main(String[] args){
        String name="Madam";
        name=name.toLowerCase();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if(name==rev){
            System.out.println("The string is palimdrome..");
        }else{
            System.out.println("The string is not palimdrome..");
        }
        System.out.println("Original String: "+name+" = Reversed string: "+rev);
    }
}
