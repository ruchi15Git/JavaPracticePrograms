package OOPs.Abstraction;

public class MainClass {
    public static void main(String[] args){
        Swift swift=new Swift();
        swift.carFun();
    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();

    void drive() {
        System.out.println("driving a car..");
    }
}

class Swift extends Engine{

    @Override
    void startEngine() {
        System.out.println("Start Engine..");
        super.drive();
    }

    @Override
    void stopEngine() {
        System.out.println("Stop the car..");
    }

    void carFun(){
        startEngine();
        stopEngine();
    }
}

