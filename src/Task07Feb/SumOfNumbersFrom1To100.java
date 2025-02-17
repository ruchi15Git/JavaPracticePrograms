package Task07Feb;

public class SumOfNumbersFrom1To100 {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to 100 is: "+sum);
    }
}
