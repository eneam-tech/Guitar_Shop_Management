package it.eneaminelli.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import it.eneaminelli.inventory.guitar_specs.GuitarBuilder;
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

    /**
     * Searches for a guitar in the inventory that matches the specifications of the given {@code searchGuitar}.
     * <p>
     * The comparison ignores serial number and price. All other fields must match exactly using enum identity
     * and string equality for the model (case-insensitive).
     *
     * @param searchGuitar the guitar with the desired specifications
     * @return the first matching guitar found, or {@code null} if no match is found
     */
    public Guitar search(Guitar searchGuitar) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = i.next();

            // Ignore serial number and price

            if (searchGuitar.getBuilder() != guitar.getBuilder()) {
                continue;
            }

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))) {
                continue;
            }

            if (searchGuitar.getType() != guitar.getType()) {
                continue;
            }

            if (searchGuitar.getBackWood() != guitar.getBackWood()) {
                continue;
            }

            if (searchGuitar.getTopWood() != guitar.getTopWood()) {
                continue;
            }

            return guitar;
        }

        return null;
    }
}
