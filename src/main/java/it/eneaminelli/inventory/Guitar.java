package it.eneaminelli.inventory;

import it.eneaminelli.inventory.guitar_specs.GuitarBuilder;
import it.eneaminelli.inventory.guitar_specs.GuitarType;
import it.eneaminelli.inventory.guitar_specs.GuitarWood;

public class Guitar{
    private String serialNumber, model;    
    final GuitarBuilder builder;   
    final GuitarType type;
    final GuitarWood backWood;
    final GuitarWood topWood;
    private double price;
    
    
    
    public Guitar(String serialNumber, double price, GuitarBuilder builder, String model, GuitarType type, GuitarWood backWood, GuitarWood topWood) {
        
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public GuitarBuilder getBuilder() {
        return builder;
    }

    public GuitarType getType() {
        return type;
    }

    public GuitarWood getBackWood() {
        return backWood;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public GuitarWood getTopWood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }
}