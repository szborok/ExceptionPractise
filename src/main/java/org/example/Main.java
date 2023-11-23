package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        //team source read in by line.
        try {
            File myFile = new File("teams-source.txt");
            Scanner myScanner = new Scanner(myFile);
            
            while (myScanner.hasNextLine()) {
                String currentLine = myScanner.nextLine();
                System.out.println(currentLine);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        }
        finally {
            System.out.println("A beolvasas elkeszult.");
        }
        
        
        
        
    }
}