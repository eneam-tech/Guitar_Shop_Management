package it.eneaminelli.inventory.guitar_specs;

/**
 * Enum representing the various types of guitars in stock.
 */
public enum GuitarType {
    ACOUSTIC, ELECTRIC;

    /**
     * Returns a formatted list of all available guitar types as a string.
     *
     * @return A string listing all guitar types.
     */
    public static String getType(){
        StringBuilder sb = new StringBuilder();
        for (GuitarType type : GuitarType.values()){
            sb.append("- ").append(type.toString()).append("\n");
        }
        return sb.toString();
    }    

    /**
     * Returns the string representation of the guitar types.
     * The type is returned in lowercase.
     *
     * @return The lowercase name of the guitar type.
     */
    public String toString(){
        switch (this) {
            case ACOUSTIC:
                return "acoustic";
            case ELECTRIC:
                return "electric";
            default:
                return ("Error in type input.\nChoose from available type:\n" + getType());
        }
    }
}
