package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factory {
    
    public static List<Player> playerListGenerator(String source) {
        List<Player> returnList = new ArrayList<>();
        
        try {
            File myFile = new File("players-source.txt");
            Scanner myScanner = new Scanner(myFile);
            
            while (myScanner.hasNextLine()) {
                String currentLine = myScanner.nextLine();
                Player currentPlayer = Factory.playerGenerator(currentLine);
                returnList.add(currentPlayer);
                
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("A beolvasas elkeszult.");
        }
        
        
        return returnList;
    }
    
    public static Player playerGenerator(String line) {
        //Nev-Kor-golokSzama-Pozicio-isKapitany
        
        String[] currentLine = line.split("-");
        String name = currentLine[0];
        Integer age = Integer.parseInt(currentLine[1]);
        Integer golokSzama = Integer.parseInt(currentLine[2]);
        String position = currentLine[3];
        Boolean isCaptain = Boolean.getBoolean(currentLine[4]);
        
        return new Player(name,age,golokSzama,position,isCaptain);
    }
    
}
