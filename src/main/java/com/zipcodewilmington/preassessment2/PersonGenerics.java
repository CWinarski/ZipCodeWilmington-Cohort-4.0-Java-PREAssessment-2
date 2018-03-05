package com.zipcodewilmington.preassessment2;



public class PersonGenerics<T> {
    private T value;

    PersonGenerics(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }



}
