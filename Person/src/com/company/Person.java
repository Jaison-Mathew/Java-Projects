package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //create functions to set values of private fields
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    //create functions to return the values of the private fields
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    //create function to check if person is a teenager
    public boolean isTeen(){
        if (this.age > 12 && this.age < 20){
            return true;
        }else {
            return false;
        }
    }

    //create function that returns the persons full name
    public String getFullName(){
        if (this.firstName.isEmpty()){
            return this.lastName;
        }else if (this.lastName.isEmpty()){
            return this.firstName;
        }else if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }else {
            return this.firstName + " " + this.lastName;
        }
    }
}
