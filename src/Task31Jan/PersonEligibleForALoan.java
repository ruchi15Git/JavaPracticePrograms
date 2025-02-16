package Task31Jan;

import java.util.Scanner;

public class PersonEligibleForALoan {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        if(age<=0){
            System.out.println("Invalid age entered- age should be positive number.");
            return;
        }
        System.out.println("Enter your per month salary: ");
        double salary=scanner.nextDouble();
        if(salary<=0){
            System.out.println("Invalid salary entered- salary should be positive number.");
            return;
        }
        System.out.println("Enter your credit score: ");
        int creditScore=scanner.nextInt();
        if(creditScore<=0){
            System.out.println("Invalid credit score entered- credit score should be positive number.");
            return;
        }
        if(age>=18 && age<=80){
            if(salary>=30000){
                if(creditScore>=650 && creditScore<=850){
                    System.out.println("Perfect you are eligible for a loan..");
                }
                else{
                    System.out.println("Sorry, your credit score is too low.");
                }
            }
            else{
                System.out.println("Your salary is not enough to apply for this loan..");
            }
        }else{
            System.out.println("Sorry, your age is not valid to apply for this loan..");
        }
    }
}
