package it.eneaminelli.inventory.guitar_specs;

public enum GuitarBuilder {
    
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    public static String getBuilders(){
        StringBuilder sb = new StringBuilder();
        for (GuitarBuilder builder : GuitarBuilder.values()){
            sb.append("- ").append(builder.toString()).append("\n");
        }
        return sb.toString();
    }

    public String toString(){
        switch (this){
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
                return "Error in model input. Select an existing builder:\n" + getBuilders();
        }
    }
}
