package OOPs.Polymorphism.Method_Overloading;

public class Main{
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(2,3)); //5
        System.out.println(c.add(2.1,3.4));//5.5
        System.out.println(c.add(3,4,5));//12
    }
}
