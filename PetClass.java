package com.company;

public class PetClass {
    private String name = "Sage";
    private int age = 4;
    private String location = "Charlotte";
    private String type = "Cat";


    public PetClass(){

    }

    public PetClass(String name, int age,String location,String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setType(String newType) {
        this.type = newType;
    }
}
