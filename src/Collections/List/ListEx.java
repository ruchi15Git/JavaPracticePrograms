package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args){
        List<String> fruits= List.of("Apple","Banana", "Cherry");
        System.out.println(fruits); //[Apple, Banana, Cherry]
        //fruits.add("Mango"); //gives exception
        //System.out.println(fruits);

        List<String> name= new ArrayList<>();
        name.add("Anjali");
        name.add("Gaurav");
        name.add("Ruchi");
        name.add("Sambhaa");
        name.add("Gabbar");
        System.out.println(name); //[Anjali, Gaurav, Rcuhi, Sambhaa, Gabbar]
        System.out.println(name.size()); //5
        System.out.println(name.get(2)); //Ruchi
        //System.out.println(name);
        name.clear();
        System.out.println(name); //[]

        List<Object> mixDataList= new ArrayList<>(); //dynamic dispatch -- parent object to the child reference
        mixDataList.add("Anjali");
        mixDataList.add('A');
        mixDataList.add(15);
        mixDataList.add(3.14);
        System.out.println(mixDataList); //[Anjali, A, 15, 3.14]

        //order is maintained
        //List is an interface
        //ArrayList provides an implementation for List
        // can store diff data types elements.


    }

    }

