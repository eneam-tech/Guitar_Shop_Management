package it.eneaminelli.inventory.guitar_specs;

public enum GuitarWood {
    CEDAR, MAHOGANY, MAPLE, ALDER, SITKA;

    public static String getWoods(){
        StringBuilder sb = new StringBuilder();
        for (GuitarWood wood : GuitarWood.values()){
            sb.append("- ").append(wood.toString()).append("\n");
        }
        return sb.toString();
    }

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
