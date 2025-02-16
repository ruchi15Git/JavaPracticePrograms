package Task31Jan;

import java.util.Scanner;

public class CalculateBonusBasedOnSalaryAndExperience {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary=scanner.nextDouble();
        System.out.println("Enter years of Experience: ");
        double yearsOfExp=scanner.nextDouble();
        double bonus=0;
        if(yearsOfExp<1){
            bonus=0;
        } else if (yearsOfExp>=1 && yearsOfExp<=3) {
            bonus=(5.0/100)*salary;
        } else if (yearsOfExp>=4 && yearsOfExp<=6) {
            bonus=(10.0/100)*salary;
        } else if (yearsOfExp>6) {
            bonus=(15.0/100)*salary;
        }
        System.out.println("Based on your experience and salary: you are eligible for a bonus amount of:  "+bonus);
    }
}
