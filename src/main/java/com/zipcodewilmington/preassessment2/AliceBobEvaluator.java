package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator{

    private String name;
    AliceBobEvaluator(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAlice(){
        if (this.name.equalsIgnoreCase(AliceBobEnum.ALICE.name)){
            return true;
        }
        return false;
    }

    public boolean isBob(){
        if (this.name.equalsIgnoreCase(AliceBobEnum.BOB.name)){
            return true;
        }
        return false;
    }
}
