package org.example;

public class Player {
    private String name;
    private Integer age;
    private Integer goalCount;
    private String position;
    private Boolean isCaptain;
    
    public Player(String name, Integer age, Integer goalCount, String position, Boolean isCaptain) {
        this.name = name;
        this.age = age;
        this.goalCount = goalCount;
        this.position = position;
        this.isCaptain = isCaptain;
    }
    
    //GETTER
    
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public Integer getGoalCount() {
        return goalCount;
    }
    
    public String getPosition() {
        return position;
    }
    
    public Boolean getCaptain() {
        return isCaptain;
    }
}
