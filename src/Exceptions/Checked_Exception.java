package Exceptions;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {
    public static void main(String[] args) throws FileNotFoundException {
        //File file= new File("C:/Users/anchate/OneDrive - Copart, Inc/Documents/Automation.txt");// -- file is present
        File file= new File("C:/users/java.txt"); // file not present
        FileReader fileReader= new FileReader(file);
    }
}
