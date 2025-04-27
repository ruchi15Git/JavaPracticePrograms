package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputList {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        List<String> names=new ArrayList<>();
        List<Integer> ages=new ArrayList<>();
        String isContinue="Y";
        while(isContinue.equalsIgnoreCase("Y")){
            System.out.println("Enter your name: ");
            String name=scanner.next();
            names.add(name);
            System.out.println("Enter you age: ");
            int age=scanner.nextInt();
            ages.add(age);
            System.out.println("Do you want to continue type y/n: ");
            isContinue=scanner.next();
        }
        for(String o1:names){
            System.out.println(o1);
        }
        for(Integer o2:ages){
            System.out.println(o2);
        }
    }
}
