package OOPSPracticeProblems;

public class MainMethodRunner {
    public static void main(String[] args){
        Person person=new Person("Anjali",23);
        System.out.println("Name: "+person.name);
        System.out.println("Age: "+person.age);

        Dog dog=new Dog("Buddy","Bulldog ");
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        dog.setName("Bella");
        dog.setBreed("Poodle");
        System.out.println("Updated name and breed: ");
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());

        Animal animal=new Animal();
        animal.makeSound();
        Cat cat= new Cat();
        cat.makeSound();

        Car car= new Car();
        car.drive();
        car.callSuperMethod();

        Employee emp=new Employee(3000);
        System.out.println(emp.salary);
        emp.work();
        HRManager hrMgr=new HRManager(4000);
        System.out.println(hrMgr.salary);
        hrMgr.work();
    }
}
