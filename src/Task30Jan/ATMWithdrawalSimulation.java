package Task30Jan;

import java.util.Scanner;

public class ATMWithdrawalSimulation {
    public static void main(String[] args){
        int accountBalance=10000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a amount you want to withdraw: ");
        int withDrawAmount=scanner.nextInt();
        if(withDrawAmount>0 && withDrawAmount%100==0 && withDrawAmount<=accountBalance){
            accountBalance=accountBalance-withDrawAmount;
            System.out.println("The account balance is: "+accountBalance);
        }else{
            System.out.println("Unable to withdraw the amount you entered..");
        }

    }
}
