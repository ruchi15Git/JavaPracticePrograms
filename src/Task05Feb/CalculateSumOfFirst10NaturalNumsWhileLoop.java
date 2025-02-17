package Task05Feb;

public class CalculateSumOfFirst10NaturalNumsWhileLoop {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers: "+sum);
    }
}
