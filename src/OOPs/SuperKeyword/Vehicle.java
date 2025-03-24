package OOPs.SuperKeyword;

public class Vehicle {
    int maxSpeed=120;
    Vehicle(){
        System.out.println("Parent default constructor");
    }
    void drive(int speed){
        System.out.println("drive safely");
    }

    void destination(){
        System.out.println("Go wherever you want with parent..");
    }
}

class Car extends Vehicle{
    int maxSpeed=110;
 Car(){
     super(); //calling parent constructor.
 }
    void drive(){
     System.out.println("drive safely with: "+super.maxSpeed);
    }
}
