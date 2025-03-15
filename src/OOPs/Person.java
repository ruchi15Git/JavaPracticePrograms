package OOPs;
public class Person{
    public static void main(String[] args){
        PersonsDataPrint personsDataPrint1=new PersonsDataPrint("Ruchi",23);
        PersonsDataPrint personsDataPrint2=new PersonsDataPrint("Gaurav",27);
        personsDataPrint1.name="Anjali";
        personsDataPrint2.age=28;
        System.out.println(personsDataPrint1.name);
        System.out.println(personsDataPrint2.age);

    }
}
class PersonsDataPrint {
    String name;
    int age;
    PersonsDataPrint(String person_nm, int person_age){
        this.name=person_nm;
        this.age=person_age;
        System.out.println("Name is: "+person_nm+" , Age is: "+person_age);
    }
}
