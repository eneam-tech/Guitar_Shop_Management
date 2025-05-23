package it.eneaminelli;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import it.eneaminelli.inventory.Inventory;
import it.eneaminelli.inventory.instruments.MusicalInstrument;
import it.eneaminelli.inventory.instruments.technicalspec.InstrumentBuilder;
import it.eneaminelli.inventory.instruments.technicalspec.InstrumentKind;
import it.eneaminelli.inventory.instruments.technicalspec.InstrumentSpec;
import it.eneaminelli.inventory.instruments.technicalspec.InstrumentType;
import it.eneaminelli.inventory.instruments.technicalspec.InstrumentWood;

/**
 * Demonstrates how to use the inventory system to find musical instruments
 * that match a customer's preferences.
 *
 * This class simulates a client providing a set of desired instrument properties,
 * and the system returns a list of matching instruments from the inventory.
 */
public class FindInstrumentTester {

    /**
     * Entry point for the instrument finder test.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // Simulates a client specifying desired instrument properties
        Map clientProperties = new HashMap();
        clientProperties.put("builder", InstrumentBuilder.GIBSON);
        clientProperties.put("backWood", InstrumentWood.MAHOGANY);
        InstrumentSpec clientSpec = new InstrumentSpec(clientProperties);

        // Searches for matching instruments
        List matchingInstruments = inventory.search(clientSpec);
        if (!matchingInstruments.isEmpty()) {
            System.out.println("You might like these instruments: ");
            for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ) {
                MusicalInstrument instrument = (MusicalInstrument) i.next();
                InstrumentSpec spec = instrument.getInstrumentSpec();
                System.out.println("We have a " + spec.getProperty("instrumentKind") + " with the following properties:");
                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ) {
                    String propertyName = (String) j.next();
                    if (propertyName.equals("instrumentKind")) {
                        continue;
                    }
                    System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));
                }
                System.out.println("You can have this " + spec.getProperty("instrumentKind") +
                        " for " + instrument.getPrice() + " euros\n---");
            }
        } else {
            System.out.println("Sorry, we don't have nothing for you.");
        }
    }

    /**
     * Initializes the inventory with a predefined set of instruments and their specifications.
     *
     * @param inventory the inventory to populate
     */
    private static void initializeInventory(Inventory inventory) {
        Map properties = new HashMap();

        properties.put("instrumentKind", InstrumentKind.GUITAR);
        properties.put("builder", InstrumentBuilder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", InstrumentType.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", InstrumentWood.MAHOGANY);
        properties.put("backWood", InstrumentWood.CEDAR);
        inventory.addInstrument("112233", 799, new InstrumentSpec(properties));

        properties.put("builder", InstrumentBuilder.MARTIN);
        properties.put("model", "Martin - 01");
        properties.put("type", InstrumentType.ELECTRIC);
        properties.put("numStrings", 8);
        properties.put("topWood", InstrumentWood.ALDER);
        properties.put("backWood", InstrumentWood.ALDER);
        inventory.addInstrument("MARTINI01", 1779.99, new InstrumentSpec(properties));

        properties.put("builder", InstrumentBuilder.FENDER);
        properties.put("model", "stratocastor");
        properties.put("type", InstrumentType.ELECTRIC);
        properties.put("topWood", InstrumentWood.ALDER);
        properties.put("backWood", InstrumentWood.ALDER);
        inventory.addInstrument("FNDRSTRTC", 1999.99, new InstrumentSpec(properties));

        properties.put("builder", InstrumentBuilder.GIBSON);
        properties.put("model", "Les Paul");
        properties.put("topWood", InstrumentWood.MAPLE);
        properties.put("backWood", InstrumentWood.MAPLE);
        inventory.addInstrument("BNJGBSNLP", 799.99, new InstrumentSpec(properties));

        properties.put("model", "SG '61 Reissue");
        properties.put("topWood", InstrumentWood.MAHOGANY);
        properties.put("backWood", InstrumentWood.MAHOGANY);
        inventory.addInstrument("BNJGBNSG61R", 1099.99, new InstrumentSpec(properties));

        properties.put("instrumentKind", InstrumentKind.MANDOLIN);
        properties.put("type", InstrumentType.ACOUSTIC);
        properties.put("model", "F-5G");
        properties.put("backWood", InstrumentWood.MAPLE);  // typo: should be "backWood"
        properties.put("topWood", InstrumentWood.MAPLE);
        properties.remove("numStrings");
        inventory.addInstrument("MNDLGBNF5G", 599.99, new InstrumentSpec(properties));

        properties.put("instrumentKind", InstrumentKind.BANJO);
        properties.put("model", "RB-3 Wreath");
        properties.put("numStrings", 5);
        properties.remove("topWood");
        inventory.addInstrument("BNJGBNRB3W", 380.99, new InstrumentSpec(properties));
    }
}
