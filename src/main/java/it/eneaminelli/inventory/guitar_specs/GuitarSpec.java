package it.eneaminelli.inventory.guitar_specs;

public class GuitarSpec {
    private GuitarBuilder builder;
    private String model;
    private GuitarType type;
    private GuitarWood topWood;
    private GuitarWood backWood;
    
    
    public GuitarSpec(GuitarBuilder builder, String model, GuitarType type, GuitarWood topWood, GuitarWood backWood){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
    }
    
    public GuitarBuilder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public GuitarType getType() {
        return type;
    }
    
    public GuitarWood getTopWood() {
        return topWood;
    }

    public GuitarWood getBackWood() {
        return backWood;
    }
}