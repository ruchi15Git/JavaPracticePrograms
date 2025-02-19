package Strings;

public class InterviewQ04 {
    public static void main(String[] args){
        String s1=new String("Anjali");
        String s2=new String("Anjali");
        String s3=new String("Anjali");
    }
}
/*
How Java Handles String Creation
Step 1: "Anjali" is a String literal, and it is stored in the String Constant Pool (SCP) if it does not already exist.
Step 2: new String("Anjali") creates a new object in the heap every time it is called. However, the argument "Anjali" refers to the SCP.
Step 3: The new String("Anjali") calls create new objects in the heap memory, but the "Anjali" inside them refers to the SCP.
Objects Created:
SCP (String Constant Pool): One instance of "Anjali" (created only once).
Heap Memory:
new String("Anjali") creates three separate objects in the heap (one for each s1, s2, and s3).
Final Count:
Total objects created: 4 (1 in SCP, 3 in heap).
Objects in SCP: 1.
Objects in heap: 3.

 */