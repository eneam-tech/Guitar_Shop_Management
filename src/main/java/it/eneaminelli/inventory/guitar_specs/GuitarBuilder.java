package it.eneaminelli.inventory.guitar_specs;

/**
 * Enum representing the various builders (brands) of guitars.
 * Each value corresponds to a different manufacturer or a generic placeholder (ANY).
 */
public enum GuitarBuilder {
    
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    /**
     * Returns a formatted list of all available guitar builders as a string.
     *
     * @return A string listing all guitar builders.
     */
    public static String getBuilders() {
        StringBuilder sb = new StringBuilder();
        for (GuitarBuilder builder : GuitarBuilder.values()) {
            sb.append("- ").append(builder.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Returns the string representation of the builder.
     * The name is returned in lowercase.
     *
     * @return The lowercase name of the builder.
     */
    @Override
    public String toString() {
        switch (this) {
            case FENDER:
                return "fender";
            case GIBSON:
                return "gibson";
            case MARTIN:
                return "martin";
            case COLLINGS:
                return "collings";
            case OLSON:
                return "olson";
            case RYAN:
                return "ryan";
            case PRS:
                return "prs";
            case ANY:
                return "any";
            default:
                return "Error in builder input. Select an existing builder:\n" + getBuilders();
        }
    }
}
