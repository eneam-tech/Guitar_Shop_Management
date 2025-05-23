package it.eneaminelli.inventory.instruments.technicalspec;

/**
 * Enum representing the various wood varieties of guitars.
 * Each value corresponds to a different kind of wood.
 */
public enum InstrumentWood {
    CEDAR, MAHOGANY, MAPLE, ALDER, SITKA;

    /**
     * Returns a formatted list of all available wood varieties as a string.
     *
     * @return A string listing all wood varieties.
     */
    public static String getWoods(){
        StringBuilder sb = new StringBuilder();
        for (InstrumentWood wood : InstrumentWood.values()){
            sb.append("- ").append(wood.toString()).append("\n");
        }
        return sb.toString();
    }
    
    /**
     * Returns the string representation of the wood variety.
     * The name is returned in lowercase.
     *
     * @return The lowercase name of the wood variety.
     */
    public String toString(){
        switch (this) {
            case CEDAR:
                return "cedar";
            case MAHOGANY:
                return "mahogany";
            case MAPLE:
                return "maple";
            case ALDER: 
                return "alder";
            case SITKA:
                return "sitka";
            default:
                return "Error in wood input. Please select existing wood type:\n" + getWoods();
        }
    }
}
