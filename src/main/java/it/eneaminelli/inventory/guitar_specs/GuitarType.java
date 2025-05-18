package it.eneaminelli.inventory.guitar_specs;

public enum GuitarType {
    ACOUSTIC, ELECTRIC;

    public static String getType(){
        StringBuilder sb = new StringBuilder();
        for (GuitarType type : GuitarType.values()){
            sb.append("- ").append(type.toString()).append("\n");
        }
        return sb.toString();
    }    

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
