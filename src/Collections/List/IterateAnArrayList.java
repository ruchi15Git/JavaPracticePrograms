package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IterateAnArrayList {
    public static void main(String[] args){
        List<Object> elements=new ArrayList<>();
        elements.add("Ruchi");
        elements.add('A');
        elements.add(15);
        elements.add(13.87);
        elements.add(true);
        elements.add(null);
        System.out.println(elements);
        for(Object str:elements){
            System.out.println(str);
        }
    }
}
