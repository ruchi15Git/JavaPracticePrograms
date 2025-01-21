package TernaryOperator;
import java.util.Scanner;

public class TernaryOperatorOnBooleanValues {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the boolean value here: ");
        boolean value=input.nextBoolean();
        //boolean value=false;
        String res=value?"True":"False";
        System.out.println(res);
    }
}
