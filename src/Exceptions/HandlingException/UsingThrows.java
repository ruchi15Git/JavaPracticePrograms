package Exceptions.HandlingException;

import java.io.FileNotFoundException;
import java.io.FileReader;

//throws need to add to method signature

public class UsingThrows {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr=new FileReader("anji.txt");
    }
}
