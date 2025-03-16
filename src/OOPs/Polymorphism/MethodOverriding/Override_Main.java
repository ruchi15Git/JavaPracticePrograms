package OOPs.Polymorphism.MethodOverriding;

public class Override_Main {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.sound();
        Cat cat=new Cat();
        cat.sound();
        dog.callParentSound();
    }
}
