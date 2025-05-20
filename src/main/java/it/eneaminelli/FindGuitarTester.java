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

        GuitarSpec whatCustomerLikes = new GuitarSpec(GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER, 12);

        //Guitar guitar = inventory.search(whatCustomerLikes);

        List<Guitar> availableGuitars = inventory.search(whatCustomerLikes);

        String listedGuitars = listGuitars(availableGuitars);

        System.out.println(listedGuitars);


    }

    private static void initializeInventory(Inventory inventory) {
        GuitarSpec spec1 = new GuitarSpec(GuitarBuilder.COLLINGS, "rocker", GuitarType.ACOUSTIC, GuitarWood.MAHOGANY, GuitarWood.ALDER, 12);
        GuitarSpec spec2 = new GuitarSpec(GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER, 6);
        GuitarSpec spec3 = new GuitarSpec(GuitarBuilder.MARTIN, "guitarrer", GuitarType.ELECTRIC, GuitarWood.MAHOGANY, GuitarWood.ALDER, 12);
        GuitarSpec spec4 = new GuitarSpec(GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER, 12);        

        inventory.addGuitar("23453", 1399.99, spec1);
        inventory.addGuitar("34562", 989.99, spec2);
        inventory.addGuitar("536720", 1999.99, spec3);
        inventory.addGuitar("3412", 1299.00, spec4);

    }

    public static String listGuitars(List<Guitar> availableGuitars){
        String returnGuitar = "";
        String noGuitar = "Sorry, no such guitar in stock";

        if(!availableGuitars.isEmpty()){
            for(Guitar availableGuitar : availableGuitars){
                String c = (" - You might like this " + availableGuitar.getGuitarSpec().getBuilder() + " " + availableGuitar.getGuitarSpec().getType() + " guitar." + " It has " +
                availableGuitar.getGuitarSpec().getBackWood() + " back and sides, " + availableGuitar.getGuitarSpec().getTopWood() + " top and " + availableGuitar.getGuitarSpec().getChordsNumber() + " chords. \n    You can have it for " + availableGuitar.getPrice() + " euros!\n");
                returnGuitar = returnGuitar.concat(c);
            }
            return returnGuitar;
        } else {
            return noGuitar;
        }
    }
}
