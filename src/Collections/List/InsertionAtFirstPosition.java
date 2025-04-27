package Collections.List;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to insert an element into the array list at the first position.
public class InsertionAtFirstPosition {
    public static void main(String[] args){
        List<String> str=new ArrayList<>();
        str.add("Yellow");
        str.add("White");
        str.add("Red");
        str.add("Black");
        str.add("Orange");
        System.out.println("List before inserting an element"+str);
        str.add(0,"Purple");
        System.out.println(str);
    }
}
