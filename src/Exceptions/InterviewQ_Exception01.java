package Exceptions;

public class InterviewQ_Exception01 {
    //ArithmeticException
    public static void main(String[] args){
        int arr[]={100,200,300,400};
        int Dr[]= {10,10,0,4};
        for(int i=0;i<arr.length;i++){
            System.out.println(divide(arr[i],Dr[i]));
        }
    }

    public static int divide(int a, int b){
        try{
        return a/b;
        }
        catch (Exception e){
            e.getStackTrace();
            //e.getMessage();
            System.out.println(e.getMessage());
        }
        return -1;
    }
}
