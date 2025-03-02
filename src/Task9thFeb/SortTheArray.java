package Task9thFeb;

public class SortTheArray {
    public static void main(String[] args){
        int[] array={12, 34, 10, 1, 100, 3, 4, 32};
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
System.out.println("Printing sorted array");
        for(int num:array){
            System.out.println(num+" ");
        }
    }
}
