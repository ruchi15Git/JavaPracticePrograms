package Programs;

import java.util.Scanner;

public class StringProgSumOfLeng {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String s1= scanner.next();
        String s2= scanner.next();
        int sum= s1.length()+s2.length();
        System.out.println(sum);
        
        String newOne= s1.substring(0,1).toUpperCase()+s1.substring(1);
        String newTwo= s2.substring(0,1).toUpperCase()+s2.substring(1);
        String gernratedString= newOne+" "+newTwo;
        System.out.println(gernratedString);

    }

}
