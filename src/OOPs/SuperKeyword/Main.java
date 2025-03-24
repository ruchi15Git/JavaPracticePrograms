package OOPs.SuperKeyword;

public class Main{
    public static void main(String[] args){
        Vehicle vehicle=new Vehicle(); //Parent default constructor
        Car car=new Car(); //Parent default constructor
        System.out.println(vehicle.maxSpeed); //120
        vehicle.drive(300); //drive safely
        car.destination(); //Go wherever you want with parent..
    }

}
