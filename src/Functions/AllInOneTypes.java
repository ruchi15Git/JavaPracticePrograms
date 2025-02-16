package Functions;
import java.util.Scanner;

public class AllInOneTypes {
    public static void main(String[] args){
        //1. Without Parameters and Without Return Type.
        //2. Without Parameters but With Return Type
        //3. With Parameters and Without Return Type
        //4. With Parameters and With Return Type
        returnString();
        String s=stringReturn();
        System.out.println(s);
        int validAge=ageToVote();
        System.out.println("Age to vote is: "+validAge);
        greetWithName("Ruchi");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name, age and salary");
        String name= scanner.next();
        int age=scanner.nextInt();
        double salary=scanner.nextDouble();
        greetWithDetails(name,age,salary);
    }
    //1. Without Parameters and Without Return Type.
    public static void returnString(){
        System.out.println("Hello, I'm Ruchi:)");
    }
    //2. Without Parameters but With Return Type
    public static String stringReturn(){
      return "How are you?";
    }

    public static int ageToVote(){
        return 18;
    }

    //3. With Parameters and Without Return Type
    public static void greetWithName(String name){

        System.out.println("Hey, your name is: "+name);
    }

    public static void greetWithDetails(String name, int age, double salary){
        System.out.println("Your name is: "+name+" Your age is: "+age+" Your salary is: "+salary);
    }

}
