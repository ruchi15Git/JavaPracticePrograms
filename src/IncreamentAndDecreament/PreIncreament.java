package IncreamentAndDecreament;

public class PreIncreament {
    public static void main(String[] args){
        int a=10;
        int b=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);
        System.out.println(a);

        //Exp and result table
        //line number|a|b
        //5|10|NA
        //6|11|11
        //7|11|NA
        //8|NA|11
    }
}
