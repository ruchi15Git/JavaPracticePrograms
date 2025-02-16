package Functions;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        //create a function sub, mul, add, div, mod
        //with parameter a & b (Take the parameter from the user)
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the values of a & b: ");
        int a=0;
        if (scanner.hasNextInt()){a=scanner.nextInt();}
        else{
            System.out.println("Please enter integer only..");
            System.exit(0);
        }
        int b=0;
        if(scanner.hasNextInt()){
            b=scanner.nextInt();
        }
        else{System.out.println("Please enter integer only..");
        System.exit(0);}
        int sub= subtractTwoNumbers(a,b);
        int mul=multiplyTwoNumbers(a,b);
        int add=addTwoNumbers(a,b);
        int div=divideTwoNumbers(a,b);
        int mod=modulusOfTwoNumbers(a,b);
        System.out.println("The subtraction is : "+sub);
        System.out.println("The multiplication is: "+mul);
        System.out.println("The addition is: "+add);
        System.out.println("The division is: "+div);
        System.out.println("The modulus is: "+mod);


    }
    public static int subtractTwoNumbers(int a, int b){
        return a-b;
    }

    public static int multiplyTwoNumbers(int a, int b){
        return a*b;
    }
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }
    public static int divideTwoNumbers(int a, int b){
        return a/b;
    }
    public static int modulusOfTwoNumbers(int a, int b){
        return a%b;
    }
}
