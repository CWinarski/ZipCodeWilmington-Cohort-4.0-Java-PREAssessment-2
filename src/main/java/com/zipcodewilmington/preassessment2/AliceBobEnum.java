package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE("ALICE"), BOB("BOB");

    String name;
    AliceBobEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getCatchPhrase(){
        return "Hey, my name is " + getName()+ "!";
    }

    public boolean isAlice(){
        if (getName() == "ALICE"){
            return true;
        }
        return false;
    }

    public boolean isBob(){
        if (getName() == "BOB"){
            return true;
        }
        return false;
    }

}
