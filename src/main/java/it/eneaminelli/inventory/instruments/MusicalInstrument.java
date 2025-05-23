package it.eneaminelli.inventory.instruments;

import it.eneaminelli.inventory.instruments.technicalspec.InstrumentSpec;

/**
 * Represents a general musical instrument in the inventory.
 * Each instrument has a unique serial number, a price, and a specification.
 */
public class MusicalInstrument {
    
    /** The unique serial number identifying the instrument. */
    private String serialNumber;
    
    /** The price of the instrument. */
    private double price;
    
    /** The specifications describing the instrument's characteristics. */
    private InstrumentSpec spec;

    /**
     * Constructs a new MusicalInstrument with the given serial number, price, and specifications.
     *
     * @param serialNumber the unique identifier of the instrument
     * @param price the price of the instrument
     * @param spec the specification object containing instrument characteristics
     */
    public MusicalInstrument(String serialNumber, double price, InstrumentSpec spec){
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    /**
     * Returns the serial number of this instrument.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Returns the price of this instrument.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the specifications of this instrument.
     *
     * @return the instrument specification object
     */
    public InstrumentSpec getInstrumentSpec() {
        return spec;
    }
}
