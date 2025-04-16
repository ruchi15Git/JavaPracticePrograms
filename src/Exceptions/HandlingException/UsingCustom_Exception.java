package Exceptions.HandlingException;

public class UsingCustom_Exception {
    public static void main(String []args) throws Exception{
        int a=10,b=0;
        System.out.println(divide(a,b));

    }

    public static int divide(int a, int b) throws Exception{
        if(b==0){
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return a/b;
    }
}
