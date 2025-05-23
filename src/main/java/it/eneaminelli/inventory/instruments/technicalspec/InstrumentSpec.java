package it.eneaminelli.inventory.instruments.technicalspec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Represents a set of specifications for a musical instrument.
 * This class uses a flexible map-based structure to store arbitrary properties
 * like builder, model, type, wood types, number of strings, etc.
 */
public class InstrumentSpec {
    //TODO: implement builder pattern (replaee map construction with API)


    /** A map containing the properties that define the instrument's characteristics. */
    private Map properties;

    /**
     * Constructs an InstrumentSpec with the given properties.
     * A defensive copy of the map is made to protect internal state.
     *
     * @param properties a map of property names to their corresponding values
     */
    public InstrumentSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    /**
     * Returns the value of the specified property.
     *
     * @param propertyName the name of the property to retrieve
     * @return the value associated with the property, or null if not found
     */
    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    /**
     * Returns the map of all properties in this specification.
     *
     * @return the map of property names to values
     */
    public Map getProperties() {
        return properties;
    }

    /**
     * Determines if this specification matches another specification.
     * It compares all properties in the other specification with this one.
     *
     * @param otherSpec the specification to compare with
     * @return true if all properties in otherSpec match those in this spec, false otherwise
     */
    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext(); ) {
            String propertyName = (String) i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }

        return true;
    }
}
