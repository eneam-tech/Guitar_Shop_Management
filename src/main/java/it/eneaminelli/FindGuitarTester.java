package it.eneaminelli;

import java.util.List;

import it.eneaminelli.inventory.Guitar;
import it.eneaminelli.inventory.Inventory;
import it.eneaminelli.inventory.guitar_specs.GuitarBuilder;
import it.eneaminelli.inventory.guitar_specs.GuitarType;
import it.eneaminelli.inventory.guitar_specs.GuitarWood;

//TODO: correct search functionality, decouple, encapsulate code
public class FindGuitarTester {
        public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatCustomerLikes = new Guitar("", 0, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);

        //Guitar guitar = inventory.search(whatCustomerLikes);

        List<Guitar> availableGuitars = inventory.search(whatCustomerLikes);

        if(availableGuitars!= null){
            /* System.out.println("You might like this " + guitar.getBuilder() + " " + guitar.getType() + " guitar:\n" + 
            guitar.getBackWood() + " back and sides, " + guitar.getTopWood() + " top.\n You can have it for " + guitar.getPrice() + " euros!"); */

            System.out.println("This is a list of compatible guitars: ");
            for (Guitar availableGuitar : availableGuitars) {
                System.out.println(" - You might like this " + availableGuitar.getBuilder() + " " + availableGuitar.getType() + " guitar." + " It has " +
                availableGuitar.getBackWood() + " back and sides, " + availableGuitar.getTopWood() + " top.\n    You can have it for " + availableGuitar.getPrice() + " euros!");
            }
        } else {
            System.out.println("Sorry, no such guitar in stock.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
        
    }
}
