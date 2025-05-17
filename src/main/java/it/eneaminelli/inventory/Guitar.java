package it.eneaminelli.inventory;

public class Guitar{
    private String serialNumber, builder, model, type, backWood, topWood;
    
    private double price;
    
    
    
    public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getTopWood() {
        return topWood;
    }
    
    public String getBackWood() {
        return backWood;
    }
    
    public String getType() {
        return type;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getBuilder() {
        return builder;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }
}