package OOPs.Polymorphism.MethodOverriding;

public class Cat extends Animal{
    void maewSound(){
        System.out.println("Does mwaw mwaw..");
    }
   @Override
    void sound(){
        System.out.println("Hello sound..");
    }
}
