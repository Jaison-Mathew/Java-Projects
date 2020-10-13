package com.company;

public class ComplexNumber {

    //create fields to represent complex number
    private double real;
    private double imaginary;

    //create constructor to initialize fields
    ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //create getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //create method to add parameters to fields
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    //create method to add real and imaginary fields from complexNumber
    public void add(ComplexNumber complexNumber){
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    //create method to subtract parameters to fields
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    //create method to subtract real and imaginary fields from complexNumber
    public void subtract(ComplexNumber complexNumber){
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }
}
