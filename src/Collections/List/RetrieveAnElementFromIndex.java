package Collections.List;

//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class RetrieveAnElementFromIndex {
    public static void main(String[] args){
        List<String> colors=new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors.get(1));
    }
}
