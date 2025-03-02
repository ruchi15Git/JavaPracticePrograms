package Arrays;

public class SumOfAnArrayElements {
    public static void main(String[] args){
        int[] array={10,20,30,40,50};
        int sum=0;
        //using for loop
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println("The sum of an Array is: "+sum);
        System.out.println("----------------------------------------------------------");
        //using for Each loop
        sum=0;
        for(int num:array){
            sum=sum+num;
        }
        System.out.println("Sum of an array: "+sum);
    }
}
