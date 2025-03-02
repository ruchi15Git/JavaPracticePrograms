package Arrays;

public class ReverseOfAnArray {
    public static void main(String[] args){
        int[] array={10,20,30,40,50};
        int reverse=0;
        for(int i=array.length-1;i>=0;i--){
            reverse=array[i];
            System.out.println(reverse);
        }

    }
}
