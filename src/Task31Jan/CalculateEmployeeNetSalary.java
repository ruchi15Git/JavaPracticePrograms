package Task31Jan;

import java.util.Scanner;

public class CalculateEmployeeNetSalary {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        double basicSalary=scanner.nextDouble();
        double userBasicSalary=getBasicSalary(basicSalary);
        System.out.println("The basic salary is: "+userBasicSalary);
        System.out.println("Enter the city type: ");
        String cityType= scanner.next();
        double HRA=calculateHRA(cityType,userBasicSalary);
        System.out.println("based on the city type, HRA is: "+HRA);
        double userDA=getDA(userBasicSalary);
        System.out.println("DA is: "+userDA);
        double anualGrossSalary=calculateGrossSalary(userBasicSalary,HRA,userDA);
        double monthlyGrossSalary=anualGrossSalary/12;
        System.out.println("Gross salary is: "+anualGrossSalary);
        double monthlyTaxDeduction=calculateIncomeTax(anualGrossSalary);
        System.out.println("Income tax is: "+monthlyTaxDeduction);
        double totalDeductions= calculateDeduction(userBasicSalary,anualGrossSalary);
        System.out.println("Total per month deductions:"+totalDeductions);
        double userNetSalary=getNetSalary(monthlyGrossSalary,totalDeductions);
        System.out.println("Employee Net salary is: "+userNetSalary);

    }
    public static double calculateHRA (String cityType, double userBasicSalary){
        double calculatedHRA=0;
        if(cityType.equals("Metro") ){
            calculatedHRA=(50.0/100)*getBasicSalary(userBasicSalary);
        }else if(cityType.equals("Non-Metro")){
            calculatedHRA =(40.0/100)*getBasicSalary(userBasicSalary);
        }else{
            System.out.println("Please enter valid city type:");
        }
        return calculatedHRA;
        }


    public static double getBasicSalary(double userBasicSalary){
        return userBasicSalary;
    }
    public static double getDA(double userBasicSalary){
        return (30.0/100)*getBasicSalary(userBasicSalary);
    }

    public static double calculateGrossSalary(double userBasicSalary, double DA, double calculatedHRA ){
        double monthlyGrossSalary= userBasicSalary+DA+calculatedHRA;
        return monthlyGrossSalary*12;
    }

    public static double calculateDeduction(double userBasicSalary, double anualGrossSalary){
        double pf=(12.0/100)*userBasicSalary;
        double tax=calculateIncomeTax(anualGrossSalary);
        return pf+tax;
    }

    public static double calculateIncomeTax(double anualGrossSalary) {
        double tax = 0;

        if (anualGrossSalary > 250000) {
            if (anualGrossSalary <= 500000) {
                tax = (anualGrossSalary - 250000) * 0.05;
            } else if (anualGrossSalary <= 1000000) {
                tax = (250000 * 0.05) + ((anualGrossSalary - 500000) * 0.20);
            } else {
                tax = (250000 * 0.05) + (500000 * 0.20) + ((anualGrossSalary - 1000000) * 0.30);
            }
        }

        return tax/12;
    }

    public static double getNetSalary( double monthlyGrossSalary, double totalDeductions){
      return monthlyGrossSalary-totalDeductions;
    }
}
