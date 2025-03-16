package OOPs.ThisKeyword;

public class Ex01_thisKeyword {
    String name;
    int age;
    Ex01_thisKeyword(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("The name is: "+this.name+", And age is: "+this.age);
    }
}

