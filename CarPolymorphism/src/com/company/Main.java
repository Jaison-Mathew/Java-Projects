package com.company;

class Car{
    private String name;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    //create method to start the engine
    public String startEngine(){
        return "The engine has been turned on";
    }

    //create method that accelerates the car
    public String accelerate(){
        return "Car accelerated by 0mph";
    }

    //create method that activates the brake
    public String brake(){
        return "The brake has been activated";
    }

}

class lambo extends Car{
    public lambo() {
        super("Lamborghini", 8);
    }

    @Override
    public String startEngine() {
        return "The engine started automatically";
    }

    @Override
    public String accelerate() {
        return "Lambo has accelerated to 60mph";
    }

    //No brake
}

class batmobile extends Car{
    public batmobile() {
        super("Batmobile", 16);
    }

    @Override
    public String startEngine() {
        return "The engine started using DNA scanner";
    }

    @Override
    public String accelerate() {
        return "The Batmobile has accelerated to 120mph";
    }

    @Override
    public String brake() {
        return "The emergency brake has been activated";
    }
}

class sedan extends Car{
    public sedan() {
        super("Sedan", 6);
    }

    //No engine start
    //No accelerate


    @Override
    public String brake() {
        return "Foot brake activated";
    }
}

public class Main {

    public static void main(String[] args) {

        batmobile batmobile = new batmobile();
        System.out.println("The " + batmobile.getName() + " has " + batmobile.getCylinders() + " cylinders");

        Car car = new Car("honda", 4);
        System.out.println(car.getCylinders());
        System.out.println(car.accelerate());
        System.out.println(car.getName());
        System.out.println(car.brake());

        sedan sedan = new sedan();
        System.out.println(sedan.getName());
        System.out.println(sedan.getCylinders());
        System.out.println(sedan.accelerate());
        System.out.println(sedan.brake());

        lambo lambo = new lambo();
        System.out.println(lambo.getName());
        System.out.println(lambo.startEngine());
        System.out.println(lambo.getCylinders());
        System.out.println(lambo.accelerate());
        System.out.println(lambo.brake());

    }

}
