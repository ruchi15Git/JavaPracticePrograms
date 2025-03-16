package OOPs.Polymorphism.MethodOverriding;

public class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Does bow bow..");
    }

    void callParentSound(){
        super.sound();
    }


}
