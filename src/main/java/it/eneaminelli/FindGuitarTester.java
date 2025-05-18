package it.eneaminelli;

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

        Guitar guitar = inventory.search(whatCustomerLikes);

        if(guitar!= null){
            System.out.println("You might like this " + guitar.getBuilder() + " " + guitar.getType() + " guitar:\n" + 
            guitar.getBackWood() + " back and sides, " + guitar.getTopWood() + " top.\n You can have it for " + guitar.getPrice() + " euros!");
        } else {
            System.out.println("Sorry, no such guitar in stock.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar( "12345", 999.99, GuitarBuilder.FENDER, "stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
    }
}
