package Exceptions;

public class Unchecked_Exception {
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        System.out.println(arr[5]); //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    }
}
