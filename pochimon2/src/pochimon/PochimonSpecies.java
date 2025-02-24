package pochimon;

import java.util.ArrayList;

public class PochimonSpecies {
    private String speciesName;
    private ArrayList<Type> types;

    public PochimonSpecies(String speciesName, ArrayList<Type> types) {
        this.speciesName = speciesName;
        this.types = types;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }
}
