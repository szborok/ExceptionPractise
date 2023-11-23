package org.example;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String shortName;
    private Integer yearsOfFoundation;
    private List<Player> players;
    
    public Team(String name, String shortName, Integer yearsOfFoundation, List<Player> players) {
        this.name = name;
        this.shortName = shortName;
        this.yearsOfFoundation = yearsOfFoundation;
        this.players = players;
    }
    
    public Team(String name, String shortName, Integer yearsOfFoundation) {
        this.name = name;
        this.shortName = shortName;
        this.yearsOfFoundation = yearsOfFoundation;
        this.players = new ArrayList<>();
    }
    
    //GETTER
    
    
    public String getName() {
        return name;
    }
    
    public String getShortName() {
        return shortName;
    }
    
    public Integer getYearsOfFoundation() {
        return yearsOfFoundation;
    }
    
    public List<Player> getPlayers() {
        return players;
    }
}
