package Arrays;

import java.util.Arrays;

public class FindTheSecondLargestNumFromAnArray {
    public static void main(String[] args){
        int[] arr={20,1,5,50,73,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
