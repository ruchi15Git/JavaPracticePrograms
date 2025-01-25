package InputsFromUsers.Scanner;

import java.util.Scanner;

public class TakeInputUsingScanner {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        System.out.println("Enter your CTC: ");
        float ctc=scanner.nextFloat();
        System.out.println("Enter your DOB: ");
        double dob=scanner.nextDouble();
        scanner.close();
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
        System.out.println("CTC is: " +ctc);
        System.out.println("DOB is: " +dob);

    }
}
