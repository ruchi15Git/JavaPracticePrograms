package Exceptions.HandlingException;

import java.util.Arrays;

public class UsingTryCatch {
    public static void main(String[] args){
        System.out.println("Hello, print this on console..");
        String str= null;
        try{
        str.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println("Execute this tooo..");
    }
}
