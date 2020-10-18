package com.company;

//Cartype class inherits from Car class
public class CarType extends Car{

    private int roadService;

    public CarType(int roadService) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity = getVelocity() + rate;
        if (newVelocity == 0){
            stop();
            setCurrentGear(1);
        }else if (newVelocity > 0 && newVelocity <= 10){
            setCurrentGear(1);
        }else if (newVelocity > 10 && newVelocity <= 20){
            setCurrentGear(2);
        }else if (newVelocity > 20 && newVelocity <= 30){
            setCurrentGear(3);
        }else{
            setCurrentGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getDirection());
        }
    }
}
