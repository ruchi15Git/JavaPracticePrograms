package OOPs.Inheritance.MultiLevel_Inheritance;

public class MultiLevel_Main {
    public static void main(String[] args){
        Son shubham= new Son();
        Father pappa=new Father();
        GrandFather anna=new GrandFather();
        shubham.home();
        shubham.fatherLand();
        shubham.Farm();

        //object creation in anothe way
        GrandFather gf= new Father();
        Father father=new Son();
        System.out.println(father.gold_grandFather);


    }
}
