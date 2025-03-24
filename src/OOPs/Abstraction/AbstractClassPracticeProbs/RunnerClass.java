package OOPs.Abstraction.AbstractClassPracticeProbs;

public class RunnerClass {
    public static void main(String[] args){
        Animal lion=new Lion();
        lion.sound();
        Tiger tiger= new Tiger();
        tiger.sound();

    }
}

abstract class Animal{
    abstract void sound();
}

class Lion extends Animal{

    @Override
    void sound() {
        System.out.println("Lion roars..");
    }
}

class Tiger extends Animal{

    @Override
    void sound() {
        System.out.println("Tiger gloarss...");
    }
}