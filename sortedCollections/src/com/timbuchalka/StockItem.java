package com.timbuchalka;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int qualityStock = 0;       // can be initialized later

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.qualityStock = 0;     // or here (but you wouldn't normally do both).
    }

    public StockItem(String name, double price, int qualityStock) {
        this.name = name;
        this.price = price;
        this.qualityStock = qualityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return qualityStock;
    }

    public void setPrice(double price) {
        if (price > 0.0){
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.qualityStock + quantity;
        if (newQuantity >= 0){
            this.qualityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItems.equals");

        if (obj == this){
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() +31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o){
            return 0;
        }

        if (o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
