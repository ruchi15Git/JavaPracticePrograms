package Strings;

public class InterviewQ01 {
    public static void main(String[] args){
        String s="Anjali";
        s.toUpperCase();
        System.out.println(s);
    }
}

/*
In your program, only one string ("Anjali") will be stored in the String Constant Pool (SCP).Explanation:
String s = "Anjali";

Since string literals are automatically stored in the String Constant Pool (SCP), the string "Anjali" is placed in the pool.
s.toUpperCase();

This method does not modify the original string because strings in Java are immutable.
Instead, it creates a new string ("ANJALI") in the heap memory, not in the SCP, because the result is not assigned to any variable.
System.out.println(s);

It still prints "Anjali" because s.toUpperCase() didn't modify s.
Final Count in SCP:
Only "Anjali" is stored in the String Constant Pool.
"ANJALI" is not added to the SCP because it was not assigned to a variable.
 */