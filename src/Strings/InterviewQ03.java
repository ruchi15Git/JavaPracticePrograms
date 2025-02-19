package Strings;

public class InterviewQ03 {
    public static void main(String[] args){
        //if using String literal- then the string will be stored in SCP
        String s1="Anjali";
        String s2="Anjali";
        String s3="Anjali";
        System.out.println(s1);
    }
}

/*
How SCP Works Here?
"Anjali" is a string literal, so it is stored in the String Constant Pool (SCP) when s1 is assigned.
s2 and s3 do not create new strings; they just point to the same "Anjali" already in SCP.
Java optimizes memory by reusing string literals in SCP instead of creating duplicates.

Final Answer:
✅ Total Strings in SCP = 1 ("Anjali")
🚫 No new strings are added for s2 and s3 (they reference the same SCP object).

Key Concept:
String literals are stored in SCP and reused to optimize memory.
s2 = "Anjali" and s3 = "Anjali" do not create new strings, they just point to the existing SCP object.
Only one object is stored in SCP in this case.
 */