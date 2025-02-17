package Task05Feb;

public class PrintTheMultiplicationTableOf5 {
    public static void main(String[] args){
        int num=5;
        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println(num+" x " +i +" = "+mul);
        }
    }
}
