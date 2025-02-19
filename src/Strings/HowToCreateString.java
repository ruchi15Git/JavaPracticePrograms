package Strings;

public class HowToCreateString {
    public static void main(String[] args){
        /*
        There are two ways:
        1. String literal
        2. By new keyword
         */

        //1. example of String literal:
        //Each time you create a string literal, JVM checks the String constant pool, if the string is already exists
        //the reference to the pooled instance id returned.

        String s1="Hello Ruchi";
        String s2="Hello Ruchi"; //it doesn't create a new instance.
        System.out.println(s2);

        //in case

        String string="Ruchi";
        string=string.concat(" Chate");
        System.out.println(string);
    }
}
