package Programs;

public class FindGreatestNumberAmongThreeNum {
    public static void main(String[] args){
        int a=1000, b=20, c=180;
        if((a>b) && (a>c)){
            System.out.println("The greatest number is: " +a);
        } else if ((b>a) && (b>c)) {
            System.out.println("The greatest number is: " +b);
        }else{
            System.out.println("The greatest number is :" +c);
        }
    }
}
