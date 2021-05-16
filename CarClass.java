package com.company;

public class CarClass {
    private String model = "Lexus";
    private String make = "ES350";
    private int year = 2016;

    public CarClass(){

    }
    public CarClass(String model,String make){
        this.model = model;
        this.make = make;
    }
    public CarClass(String model,String make,int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public String getMake() {
        return make;
    }
    public int getYear(){
        return year;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }
    public void setMake(String newMake) {
        this.make = newMake;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
    public boolean CarBoolean(){
        return true;
        }
    public String CarString(){
       
        return "This is a string.";

    }
    }

