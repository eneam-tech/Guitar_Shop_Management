package it.eneaminelli.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import it.eneaminelli.inventory.guitar_specs.GuitarBuilder;
import it.eneaminelli.inventory.guitar_specs.GuitarType;
import it.eneaminelli.inventory.guitar_specs.GuitarWood;


public class Inventory {
    
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarBuilder builder, String model, GuitarType type, GuitarWood backWood, GuitarWood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);

        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();

            //Ignore S/N since it's unique
            //Ignore price since it's unique

            if (searchGuitar.getBuilder() != guitar.getBuilder()){
                continue;
            }

            String model = searchGuitar.getModel().toLowerCase();
            if((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))){
                continue;
            }

            if(searchGuitar.getType() != guitar.getType()){
                continue;
            }

            if(searchGuitar.getBackWood() != guitar.getBackWood()){
                continue;
            }
            
            if(searchGuitar.getTopWood() != guitar.getTopWood()){
                continue;
            }

            return guitar;

        }

        return null;

    }





}

