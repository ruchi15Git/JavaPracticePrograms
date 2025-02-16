package Task31Jan;

import java.util.Scanner;

public class ElectricityBillCalculationBasedOnUnits {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the units: ");
        int units=scanner.nextInt();
        double billAmount=0;
        if(units>=0 && units<=100){
            billAmount=units*0.50;
        } else if (units>=101 && units<=200) {
            billAmount=units*0.75;
        } else if (units>=201 && units<=300) {
            billAmount=units* 1.20;
        }else if (units>300){
            billAmount=units*1.50;
        }
        System.out.println("The generated bill for "+units+" units is: "+billAmount);
    }
}
