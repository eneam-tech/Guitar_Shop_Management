package it.eneaminelli.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import it.eneaminelli.inventory.instruments.MusicalInstrument;
import it.eneaminelli.inventory.instruments.technicalspec.InstrumentSpec;

/**
 * Manages a collection of musical instruments.
 * Provides functionality to add instruments, retrieve them by serial number,
 * and search for matching instruments based on specific criteria.
 */
public class Inventory {

    /** A list that holds all the instruments in the inventory. */
    private List inventory;

    /**
     * Constructs an empty inventory.
     */
    public Inventory() {
        inventory = new LinkedList();
    }

    /**
     * Adds a new instrument to the inventory.
     *
     * @param serialNumber the unique identifier of the instrument
     * @param price the price of the instrument
     * @param spec the specifications describing the instrument
     */
    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        MusicalInstrument instrument = new MusicalInstrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    /**
     * Retrieves a musical instrument from the inventory by its serial number.
     *
     * @param serialNumber the unique identifier of the instrument
     * @return the instrument with the matching serial number, or null if not found
     */
    public MusicalInstrument get(String serialNumber) {
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            MusicalInstrument instrument = (MusicalInstrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    /**
     * Searches the inventory for instruments matching the given specification.
     *
     * @param searchSpec the specifications to match against
     * @return a list of instruments that match the given specification
     */
    public List search(InstrumentSpec searchSpec) {
        List matchingInstruments = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            MusicalInstrument instrument = (MusicalInstrument) i.next();
            if (instrument.getInstrumentSpec().matches(searchSpec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}
