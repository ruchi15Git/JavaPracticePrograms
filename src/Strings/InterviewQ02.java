package Strings;

public class InterviewQ02 {
    public static void main(String[] args){
        String s="Ruchi";
        s=s.toUpperCase();
        System.out.println(s);
    }
}

/*
Strings Stored in SCP:
"Ruchi" → Stored in SCP because it's a string literal.
"RUCHI" → Also stored in SCP, because s.toUpperCase() returns a new string, and since it is assigned to s, it gets stored in the SCP (not just in the heap).
Final Answer:
✅ Total Strings in SCP = 2 ("Ruchi" and "RUCHI")
Key Concept:
String literals (like "Ruchi") are automatically stored in the SCP.
If a string operation (like toUpperCase()) creates a new string and is assigned to a variable, it gets stored in SCP.
If s.toUpperCase() wasn't assigned, "RUCHI" would have been created in heap memory only.
 */