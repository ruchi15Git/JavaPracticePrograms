package Collections.List;

import java.util.ArrayList;

public class ArrayList_Ex {
    public static void main(String[] args){
        ArrayList<Object> listItem=new ArrayList<>();
        listItem.add("Ruchi");
        listItem.add(15);
        listItem.add("Employee");
        listItem.add(23100);
        listItem.add(true);
        listItem.add(null);
    System.out.println(listItem); //this will give an array of element : [Ruchi, 15, Employee, 23100, true, null]
        //Iterating the array below: Object used because of different data type.
        for(Object list:listItem){
            System.out.println(list);
        }

    }
}
