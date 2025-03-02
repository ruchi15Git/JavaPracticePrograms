package Constructor;

public class DefaultEx02 {
    public static void main(String[] args){
        Car car=new Car();
        //System.out.println(car);

    }
}
class Car{
    Car(){
        System.out.println("Hello, this will be printed");
    }
}
