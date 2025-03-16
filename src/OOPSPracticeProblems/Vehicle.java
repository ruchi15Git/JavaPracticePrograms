package OOPSPracticeProblems;

public class Vehicle {
    void drive(){
        System.out.println("Drive...");
    }
}

class Car extends Vehicle{
    @Override
    void drive(){
        System.out.println("Repairing a car..");
    }

    void callSuperMethod(){
        super.drive();
    }
}
