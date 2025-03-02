package Arrays;

public class FindMaxAndMinOfArray {
    public static void main(String[] args){
        int[] array={10,30,21,77,2,80,76};
        int max_value=maxValueFromArray(array);
        System.out.println("Maximum value from an array is: "+max_value);
        int min_value=minValueFromArray(array);
        System.out.println("Minimum value from an array is: "+min_value);

    }

    public static int maxValueFromArray(int[] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int minValueFromArray(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

}
