package OOPs.Abstraction;

public class InterfacesEx {
    public static void main(String[] args){
        Car car=new Car();
        car.runCarFun();
    }
}

interface Vehicle {
void startEngine();
void stopEngine();
default void drive(){
    System.out.println("drive the car..");
}
}

interface Brakes{
    void applyBrake();
}

class Car implements Vehicle, Brakes{

    @Override
    public void applyBrake() {
        System.out.println("Apply brakes..");
    }

    @Override
    public void startEngine() {
        System.out.println("Start the Engine..");
        drive();
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the car..");
    }

    void runCarFun(){
        startEngine();
        applyBrake();
        stopEngine();
    }
}