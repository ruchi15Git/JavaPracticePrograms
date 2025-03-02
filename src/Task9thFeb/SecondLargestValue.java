package Task9thFeb;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestValue {
    public static void main(String[] args){
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
