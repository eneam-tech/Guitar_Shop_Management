package it.eneaminelli.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import it.eneaminelli.inventory.guitar_specs.GuitarBuilder;
import it.eneaminelli.inventory.guitar_specs.GuitarSpec;
import it.eneaminelli.inventory.guitar_specs.GuitarType;
import it.eneaminelli.inventory.guitar_specs.GuitarWood;

/**
 * The {@code Inventory} class manages a collection of {@link Guitar} objects.
 * It provides functionality to add guitars, retrieve a guitar by serial number,
 * and search for guitars that match certain specifications.
 */
public class Inventory {

    /** The list of guitars in the inventory. */
    private List<Guitar> guitars;

    /**
     * Constructs an empty inventory.
     */
    public Inventory() {
        guitars = new LinkedList<>();
    }

    /**
     * Adds a new {@link Guitar} to the inventory.
     *
     * @param serialNumber the serial number of the guitar
     * @param price the price of the guitar
     * @param builder the builder (brand) of the guitar
     * @param model the model of the guitar
     * @param type the type of the guitar (e.g., electric or acoustic)
     * @param backWood the type of wood used for the back of the guitar
     * @param topWood the type of wood used for the top of the guitar
     */
    public void addGuitar(String serialNumber, double price, GuitarBuilder builder, String model, GuitarType type, GuitarWood backWood, GuitarWood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    /**
     * Retrieves a {@link Guitar} from the inventory by its serial number.
     *
     * @param serialNumber the serial number of the guitar to retrieve
     * @return the matching guitar, or {@code null} if not found
     */
    public Guitar getGuitar(String serialNumber){
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }



    public List<Guitar> search (GuitarSpec searchSpec){
        List<Guitar> matchingGuitars = new LinkedList();
        for(Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            //Ignore S/N since unique
            //Ignore price
            if(searchSpec.getBuilder() != guitarSpec.getBuilder()){
                continue;
            }
            String model = searchSpec.getModel();
            if((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel()))) {
                continue;
            }
            if(searchSpec.getType() != guitarSpec.getType()) {
                continue;
            }
            if (searchSpec.getBackWood() != guitarSpec.getBackWood()) {
                continue;
            }
            if (searchSpec.getTopWood() != guitarSpec.getTopWood()) {
                continue;
            }

            matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}
