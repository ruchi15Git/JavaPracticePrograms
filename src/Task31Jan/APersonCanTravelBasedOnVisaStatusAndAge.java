package Task31Jan;

import java.util.Scanner;

public class APersonCanTravelBasedOnVisaStatusAndAge {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= scanner.nextInt();
        if(age<=0){
            System.out.println("Your age is not valid..");
            return;
        }
        System.out.println("Enter the visa status as valid/Invalid: ");
        String visaStatus=scanner.next().toLowerCase();
        if(age>=18 && visaStatus.equals("valid")){
            System.out.println("A Person can travel.");
        }else{
            System.out.println("A Person cannot travel.");
        }
    }
}
