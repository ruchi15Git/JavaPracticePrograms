package Arrays;

public class ArrayDeclaration {
    public static void main(String[] args){
        //1st way of array declaration
        int[] a ={10,20,30,40};
        System.out.println(a[0]); //10
        System.out.println(a.length);

        System.out.println("----------------------------------------------");
        //2nd way of array declaration
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        System.out.println(arr[1]);
    }
}
