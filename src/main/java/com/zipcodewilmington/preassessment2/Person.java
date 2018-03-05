package com.zipcodewilmington.preassessment2;


import java.util.Date;

public class Person{

    protected PersonGenerics<String> name;
    protected PersonGenerics<Integer> age;
    protected PersonGenerics<Date> birthDate;

    Person(String name, int age, Date birthDate){
        this.name = new PersonGenerics<String>(name);
        this.age = new PersonGenerics<Integer>(age);
        this.birthDate = new PersonGenerics<Date>(birthDate);
    }



}
