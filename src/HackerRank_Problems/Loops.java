package HackerRank_Problems;

import java.util.Scanner;

public class Loops {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
       System.out.println(sum);
    }

}
