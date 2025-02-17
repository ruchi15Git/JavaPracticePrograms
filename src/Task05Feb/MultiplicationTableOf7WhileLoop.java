package Task05Feb;

public class MultiplicationTableOf7WhileLoop {
    public static void main(String[] args){
        int num=7;
        int i=1;
        while(i<=10){
            int mul=num*i;
            System.out.println(num +" x "+i+" = "+mul);
            i++;
        }
    }
}
