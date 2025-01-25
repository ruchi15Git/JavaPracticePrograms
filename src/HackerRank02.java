import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class HackerRank02 {
        public static void main(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String: ");
            String str=sc.nextLine();
            String trimmedStr=str.trim();
            System.out.println(trimmedStr);
            /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            int arr[]={1,2,3,4,5};
            int sum=0;
            for(int i=0;i<=arr.length-1;i++){
                sum=sum+arr[i];
            }
            System.out.println(sum);
        }
    }

