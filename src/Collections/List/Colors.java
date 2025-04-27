package Collections.List;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create an array list, add some colors (strings) and print out the collection.

public class Colors {
    public static void main(String[] args){
        List<String> colors=new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");
        colors.add("Orange");
        colors.add("White");
        System.out.println(colors);
        for(String itlist: colors){
            System.out.println(itlist);
        }
    }
}
