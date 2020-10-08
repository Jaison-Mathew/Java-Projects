package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    //create functions to set the first and second numbers
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    //create methods to make numbers public
    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    //create method that returns sum of firstNumber and secondNumber
    public double getAdditionResult(){
        return (this.firstNumber + this.secondNumber);
    }

    //create method that returns subtraction of firstNumber and secondNumber
    public double getSubtractionResult(){
        return (this.firstNumber - this.secondNumber);
    }

    //create method that returns multiplication of firstNumber and secondNumber
    public double getMultiplicationResult(){
        return (this.firstNumber * this.secondNumber);
    }

    //create method that returns division of firstNumber and secondNumber
    public double getDivisionResult(){
        if (this.secondNumber == 0){
            return 0;
        }else {
            return (this.firstNumber / this.secondNumber);
        }
    }

}
