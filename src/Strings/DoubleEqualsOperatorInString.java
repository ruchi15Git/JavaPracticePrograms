package Strings;

public class DoubleEqualsOperatorInString {
    public static void main(String[] args){
        String s1="Anjali";
        String s2="Anjali";
        String s3=new String("Anjali");
        String s4=new String("Anjali");
        System.out.println(s1==s2); //true
        //Both s1 and s2 refer to the same object in the String Constant Pool (SCP), so == returns true.

        System.out.println(s3==s4); //false
        //Each new String("Java") creates a separate object in the heap, so s3 and s4 have different memory locations, making == return false.

    }
}
