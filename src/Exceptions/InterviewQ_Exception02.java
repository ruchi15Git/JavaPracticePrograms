package Exceptions;

public class InterviewQ_Exception02 {
    //nullPointerException
    public static void main(String[] args){
        try{
        String str= null;
        System.out.println(str.trim());
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception occured.");
        }

    }
}
