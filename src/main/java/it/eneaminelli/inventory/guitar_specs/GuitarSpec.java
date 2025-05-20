package it.eneaminelli.inventory.guitar_specs;

public class GuitarSpec {
    private GuitarBuilder builder;
    private String model;
    private GuitarType type;
    private GuitarWood topWood;
    private GuitarWood backWood;
    private int chordsNumber;
    
    
    public GuitarSpec(GuitarBuilder builder, String model, GuitarType type, GuitarWood topWood, GuitarWood backWood, int chordsNumber){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.chordsNumber = chordsNumber;
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
    
    public int getChordsNumber() {
        return chordsNumber;
    }

    public boolean compareItems(GuitarSpec otherGuitarSpec){
        if(builder != otherGuitarSpec.builder){
            return false;
        }
        if((model != null) && (!model.equals("")) && (!model.equals(otherGuitarSpec.model))){
            return false;
        }
        if(type != otherGuitarSpec.type){
            return false;
        }
        if(topWood != otherGuitarSpec.topWood){
            return false;
        }
        if(backWood != otherGuitarSpec.backWood){
            return false;
        }
        if(chordsNumber != otherGuitarSpec.chordsNumber){
            return false;
        }

        return true;
    }
}