package OOPs.Polymorphism.Method_Overloading;

public class Calculator {
    //method to add 2 integers
    int add(int a, int b){
        return a+b;
    }
    //overloaded method to add 3 integers
    int add(int a, int b, int c){
        return a+b+c;
    }
    //overloaded  method to add 2 doubles
    double add(double a, double b){
        return a+b;
    }
}
