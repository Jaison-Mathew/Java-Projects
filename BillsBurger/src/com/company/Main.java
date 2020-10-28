package com.company;

class Hamburger{
    private String name;
    private double price;
    private String breadRollType;
    private String meat;

    private String addLettuceName;
    private double addLettucePrice;

    private String addTomatoName;
    private double addTomatoPrice;

    private String addOnionName;
    private double addOnionPrice;

    private String addCheeseName;
    private double addCheesePrice;


    public Hamburger(String name, double price, String breadRollType, String meat) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public void addLettuce(String name, double price){
        this.addLettuceName = name;
        this.addLettucePrice = price;
    }

    public void addTomato(String name, double price){
        this.addTomatoName = name;
        this.addTomatoPrice = price;
    }

    public void addOnion(String name, double price){
        this.addOnionName = name;
        this.addOnionPrice = price;
    }

    public void addCheese(String name, double price){
        this.addCheeseName = name;
        this.addCheesePrice = price;
    }

    public double burgerTotal(){
        double priceTotal = this.price;
        System.out.println(this.name + " hamburger on " + this.breadRollType + " roll with " + this.meat + " costs $" + this.price);
        if (this.addLettuceName != null){
            priceTotal += addLettucePrice;
            System.out.println(this.addLettuceName + " added: $" + this.addLettucePrice);
        }

        if (this.addTomatoName != null){
            priceTotal += addTomatoPrice;
            System.out.println(this.addTomatoName + " added: $" + this.addTomatoPrice);
        }

        if (this.addOnionName != null){
            priceTotal += addOnionPrice;
            System.out.println(this.addOnionName + " added: $" + this.addOnionPrice);
        }

        if (this.addCheeseName != null){
            priceTotal += addCheesePrice;
            System.out.println(this.addCheeseName + " added: $" + this.addCheesePrice);
        }

        return priceTotal;
    }

}

class healthyBurger extends Hamburger{

    private String addCarrotName;
    private double addCarrotPrice;

    private String addFryName;
    private double addFryPrice;



    public healthyBurger(double price, String meat) {
        super("Healthy ", price, "Brown Rye", meat);
    }

    public void addCarrot(String name, double price){
        this.addCarrotName = name;
        this.addCarrotPrice = price;
    }

    public void addFries(String name, double price){
        this.addFryName = name;
        this.addFryPrice = price;
    }

    @Override
    public double burgerTotal() {
        double burgerPrice = super.burgerTotal();
        if (this.addFryName != null){
            burgerPrice += this.addFryPrice;
            System.out.println("Added " + this.addFryName + " for an extra $" + this.addFryPrice);
        }

        if (this.addCarrotName != null){
            burgerPrice += this.addCarrotPrice;
            System.out.println("Added " + this.addCarrotName + " for an extra $" + this.addCarrotPrice);
        }

        return burgerPrice;
    }
}

class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", 14.51, "White", "Bacon");
        super.addLettuce("Lettuce Chips", 2.60);
        super.addTomato("Tomato juice", 1.50);
    }

    @Override
    public void addLettuce(String name, double price) {
        System.out.println("Cannot add additions to a Deluxe burger");
    }

    @Override
    public void addTomato(String name, double price) {
        System.out.println("Cannot add additions to a Deluxe burger");
    }

    @Override
    public void addOnion(String name, double price) {
        System.out.println("Cannot add additions to a Deluxe burger");
    }

    @Override
    public void addCheese(String name, double price) {
        System.out.println("Cannot add additions to a Deluxe burger");
    }
    
}

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Regular", 5.00, "White Bread", "Beef");
        double price = hamburger.burgerTotal();
        hamburger.addLettuce("Cabbage Lettuce", 1.15);
        hamburger.addOnion("Red Onions", 1.10);
        hamburger.addTomato("Tomato", 1.00);
        hamburger.addCheese("American Cheese", 1.20);
        price = hamburger.burgerTotal();
        System.out.println("Total hamburger price: $" + hamburger.burgerTotal());

        healthyBurger healthyBurger = new healthyBurger(5.67, "Chicken");
        healthyBurger.addCarrot("French fries", 5.43);
        healthyBurger.addFries("Carrots", 3.41);
        System.out.println("Total amount for healthy burger is $" + healthyBurger.burgerTotal());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addLettuce("lettuce", 2.32);
        deluxeBurger.burgerTotal();
    }
}
