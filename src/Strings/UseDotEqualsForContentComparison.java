package Strings;

public class UseDotEqualsForContentComparison {
    public static void main(String[] args){
        String s1="Anjali";
        String s2="Anjali";
        String s3=new String("Anjali");
        String s4=new String("Anjali");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s4));

        // all returns true- as .equals compares the content.

    }
}
