package Exceptions.HandlingException;

import java.util.Arrays;

public class UsingTry_MultipleCatch {
    public static void main(String[] args){
        int a=0, b=10;
        System.out.println("Start the program..");
        try {
            int division = b / a;
            System.out.println("division is: " + division);
        } catch (NullPointerException n){
            System.out.println(Arrays.toString(n.getStackTrace()));
            System.out.println("print this if valid..");
        } catch (ArithmeticException ae){
            System.out.println("If Arithmetic is valid then print thisss");
            System.out.println(ae.getMessage());
            System.out.println(Arrays.toString(ae.getStackTrace()));
        }
    }
}
