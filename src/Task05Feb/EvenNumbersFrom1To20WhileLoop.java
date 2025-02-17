package Task05Feb;

public class EvenNumbersFrom1To20WhileLoop {
    public static void main(String[] args){
        int i=1;
        while(i<=20){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
