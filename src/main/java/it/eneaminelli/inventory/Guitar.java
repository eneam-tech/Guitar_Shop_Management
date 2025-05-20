package it.eneaminelli.inventory;

import it.eneaminelli.inventory.guitar_specs.GuitarSpec;

/**
 * Represents a guitar in the inventory with all its specifications.
 * Includes details such as serial number, builder, model, type, woods, and price.
 */
public class Guitar {

    /** Unique identifier for the guitar */
    private String serialNumber;

    /** Price of the guitar */
    private double price;

    /**
     * Technical specification for the guitar:
     * builder, model, type and wood
     */
    private GuitarSpec guitarSpec;

    /**
     * Constructs a new {@code Guitar} with the given specifications.
     *
     * @param serialNumber the unique serial number of the guitar
     * @param price the price of the guitar
     * @param builder the builder/brand of the guitar
     * @param model the model name
     * @param type the type of the guitar (electric/acoustic)
     * @param backWood the wood used for the back
     * @param topWood the wood used for the top
     */
    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    /**
     * Gets the serial number of the guitar.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets a new price for the guitar.
     *
     * @param newPrice the new price
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Gets the price of the guitar.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * Gets the technical specification of the guitar
     * @return builder, model, type, top and back wood of the guitar
     */
    public GuitarSpec getGuitarSpec(){
        return guitarSpec;
    }
}
