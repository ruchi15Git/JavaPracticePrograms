package Task01Feb;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        String category="";
        if(age>=0 && age<=12){
            category="Child";
        } else if (age>=13 && age<=19) {
            category="Teenager";
        } else if(age>=20 && age<=64){
            category="an Adult";
        } else if (age>=65) {
            category ="Senior Citizen";
        }
        System.out.println("You are "+category);
    }
}
