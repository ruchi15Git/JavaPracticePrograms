package TernaryOperator;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        //int age=25;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=input.nextInt();
        String isEligible=(age>=18)?"Yes, you can Vote.":"Sorry, your age must be 18 or more than that to vote.";
        System.out.println(isEligible);
    }
}
