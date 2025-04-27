package Generics;

public class GenericMethod {

    static <T> void getDisply(T arg){
        System.out.println(arg);
    }

    public static void main(String[] args){
        getDisply("Ruchi");
        getDisply(15);
        getDisply(4800.43);
        getDisply('A');
    }
}
