package SwitchStatement;

import java.util.Scanner;

public class PrintDayBasedOnNum {
    public static void main(String[] args){
        //print day based on the input from 1 to 7
        /*
        1: monday
        2: tuesday
        3: wednesday
        4: thursday
        5: friday
        6: saturday
        7: sunday
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the dayNum: ");
        int dayNum=scanner.nextInt();
        switch (dayNum){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default:System.out.println("Invalid dayNum..");
        }

    }
}
