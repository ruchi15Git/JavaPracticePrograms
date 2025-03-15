package OOPs;

public class MainClass {
    public static void main(String[] args){
        Dog dog1=new Dog("Bella","Labrador Retriever");
        System.out.println("Dog name is: "+dog1.getName() +" , Breed is: "+dog1.getBreed());
        dog1.setName("Daisy");
        dog1.setBreed("Poodle");
        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        Rectangle rectangle=new Rectangle();
        rectangle.calculateArea(12,20);
        System.out.println("The are of a rectangle is: "+rectangle.getArea());
        rectangle.calculatePerimeter(12,6);
        System.out.println("The perimeter of a rectangle is: "+rectangle.getPerimeter());
        Circle circle=new Circle(2.13);
        System.out.println("Area of a circle: "+circle.getAreaOfCircle());
        circle.setRadius(4);
        System.out.println("Area of a circle: "+circle.getAreaOfCircle());

    }
}
