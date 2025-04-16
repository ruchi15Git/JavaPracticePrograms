package Exceptions.HandlingException;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class UsingTry_catch_finally {
    public static void main(String[] args){
        System.out.println("Opening the browser");
        try{
        Scanner scanner=null;
        int a=scanner.nextInt();
        } catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        finally{
            System.out.println("closing the browser..");
        }

    }
}
