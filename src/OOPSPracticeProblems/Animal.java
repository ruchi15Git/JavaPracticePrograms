package OOPSPracticeProblems;

public class Animal {
    void makeSound(){
        System.out.println("generic sound..");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bark..");
    }
}