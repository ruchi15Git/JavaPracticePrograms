package Strings;

public class StringBuilderMethods {
    public static void main(String[] args){
        /*
        StringBuilder is a mutable sequence of characters in Java. Unlike String, which is immutable, StringBuilder allows modifications to the same object, making it more efficient for string manipulations like concatenation, insertion, deletion, and replacement.

1. Why Use StringBuilder?
Mutable → Can modify the same object without creating a new one.
Faster than String → Avoids unnecessary object creation in loops or frequent modifications.
Not thread-safe → Unlike StringBuffer, StringBuilder is not synchronized, making it faster but unsuitable for multi-threaded environments.

There are three ways to create a StringBuilder:

a) Using Default Constructor
Creates an empty StringBuilder with an initial capacity of 16 characters.

java
Copy
Edit
StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity()); // Output: 16
b) Using String as Initial Value
Creates a StringBuilder initialized with a given string.

java
Copy
Edit
StringBuilder sb = new StringBuilder("Hello");
System.out.println(sb);  // Output: Hello
c) Specifying Initial Capacity
Creates an empty StringBuilder with a specified capacity.

java
Copy
Edit
StringBuilder sb = new StringBuilder(50);
System.out.println(sb.capacity()); // Output: 50
         */

        StringBuilder stringBuilder=new StringBuilder("Ruchi");
        System.out.println(stringBuilder);
        //append()
        stringBuilder.append(" Chate");
        System.out.println(stringBuilder);

        //insert()
        stringBuilder.insert(11," ,How are you?");
        System.out.println(stringBuilder);

        //replace()
        stringBuilder.replace(0,5,"Anjali");
        System.out.println(stringBuilder);

        //delete()
        stringBuilder.delete(12,26);
        System.out.println(stringBuilder);

        //reverse()
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        //capacity()
        System.out.println(stringBuilder.capacity());

        //ensureCapacity()
        stringBuilder.ensureCapacity(50);
        System.out.println(stringBuilder.capacity());

        //charAt()

        System.out.println(stringBuilder.charAt(4));

        //setCharAt()
        stringBuilder.setCharAt(4,'F');
        System.out.println(stringBuilder);

        //length()
        System.out.println(stringBuilder.length());



    }
}
