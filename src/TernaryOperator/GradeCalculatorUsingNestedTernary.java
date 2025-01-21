package TernaryOperator;
import java.util.Scanner;

public class GradeCalculatorUsingNestedTernary {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=input.nextInt();
        //int marks=101;
        /*boolean cond1=(marks<=100)&&(marks>=90);
        boolean cond2= (marks<=89)&&(marks>=80);
        boolean cond3=(marks<=79)&&(marks>=70);
        boolean cond4=(marks<=69)&&(marks>=60);
        boolean cond5=(marks>=0)&&(marks<=59);*/
        String grade=(marks<=100)&&(marks>=90)?"A":(marks<=89)&&(marks>=80)?"B":(marks<=79)&&(marks>=70)?"C":(marks<=69)&&(marks>=60)?"D":(marks>=0)&&(marks<=59)?"F":"Please input valid marks";
        System.out.println("Grade is: "+grade);
    }
}
