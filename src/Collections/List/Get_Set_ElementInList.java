package Collections.List;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

public class Get_Set_ElementInList {
    public static void main(String[] args){
        List<Object> list=new ArrayList<>();
        list.add("Ruchi");
        list.add("Guarav");
        list.add("Sambha");
        list.add("Gabbar");
        System.out.println(list.get(2));
        list.set(2,"Domyaa");
        System.out.println(list);
        //Iterating the list
        // 1. Using normal for loop
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
System.out.println("--------------------------");
        //2. Using for each loop
        for(Object itrList:list){
            System.out.println(itrList);
        }
    }
}
