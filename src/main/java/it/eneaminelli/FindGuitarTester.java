package it.eneaminelli;

import java.util.List;

import it.eneaminelli.inventory.Guitar;
import it.eneaminelli.inventory.Inventory;
import it.eneaminelli.inventory.guitar_specs.GuitarBuilder;
import it.eneaminelli.inventory.guitar_specs.GuitarSpec;
import it.eneaminelli.inventory.guitar_specs.GuitarType;
import it.eneaminelli.inventory.guitar_specs.GuitarWood;

//TODO: correct search functionality, decouple, encapsulate code
public class FindGuitarTester {
        public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatCustomerLikes = new GuitarSpec(GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);

        //Guitar guitar = inventory.search(whatCustomerLikes);

        List<Guitar> availableGuitars = inventory.search(whatCustomerLikes);

        String listedGuitars = listGuitars(availableGuitars);

        System.out.println(listedGuitars);


    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        
    }

    public static String listGuitars(List<Guitar> availableGuitars){
        String returnGuitar = "";
        String noGuitar = "Sorry, no such guitar in stock";

        if(!availableGuitars.isEmpty()){
            for(Guitar availableGuitar : availableGuitars){
                String c = (" - You might like this " + availableGuitar.getGuitarSpec().getBuilder() + " " + availableGuitar.getGuitarSpec().getType() + " guitar." + " It has " +
                availableGuitar.getGuitarSpec().getBackWood() + " back and sides, " + availableGuitar.getGuitarSpec().getTopWood() + " top.\n    You can have it for " + availableGuitar.getPrice() + " euros!\n");
                returnGuitar = returnGuitar.concat(c);
            }
            return returnGuitar;
        } else {
            return noGuitar;
        }
    }
}
