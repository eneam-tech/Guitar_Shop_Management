package it.eneaminelli.inventory;

import it.eneaminelli.inventory.guitar_specs.GuitarBuilder;
import it.eneaminelli.inventory.guitar_specs.GuitarType;
import it.eneaminelli.inventory.guitar_specs.GuitarWood;

/**
 * Represents a guitar in the inventory with all its specifications.
 * Includes details such as serial number, builder, model, type, woods, and price.
 */
public class Guitar {

    /** Unique identifier for the guitar */
    private String serialNumber;

    /** Model name of the guitar */
    private String model;

    /** Brand or builder of the guitar */
    private final GuitarBuilder builder;

    /** Type of the guitar (e.g., acoustic, electric) */
    private final GuitarType type;

    /** Type of wood used for the back of the guitar */
    private final GuitarWood backWood;

    /** Type of wood used for the top of the guitar */
    private final GuitarWood topWood;

    /** Price of the guitar */
    private double price;

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
    public Guitar(String serialNumber, double price, GuitarBuilder builder, String model, GuitarType type, GuitarWood backWood, GuitarWood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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
     * Gets the model name of the guitar.
     *
     * @return the model name
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the builder (brand) of the guitar.
     *
     * @return the guitar builder
     */
    public GuitarBuilder getBuilder() {
        return builder;
    }

    /**
     * Gets the type of the guitar.
     *
     * @return the guitar type
     */
    public GuitarType getType() {
        return type;
    }

    /**
     * Gets the wood type used for the back of the guitar.
     *
     * @return the back wood
     */
    public GuitarWood getBackWood() {
        return backWood;
    }

    /**
     * Gets the wood type used for the top of the guitar.
     *
     * @return the top wood
     */
    public GuitarWood getTopWood() {
        return topWood;
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
}
