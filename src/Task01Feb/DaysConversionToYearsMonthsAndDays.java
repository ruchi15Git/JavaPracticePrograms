package Task01Feb;

import java.util.Scanner;

public class DaysConversionToYearsMonthsAndDays {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter days: ");
        long days= scanner.nextLong();
        if(days>=365) {
            int years = (int) days / 365;
            days = (int) days % 365;
            int months = (int) days / 30;
            days = (int) days % 30;
            System.out.println(years+" Years, "+months+" Months, "+days+" Days.");
        }else {
            int months = (int) days / 30;
            days = (int) days % 30;
            System.out.println(months+" Months, "+days+" Days.");
        }

    }
}
