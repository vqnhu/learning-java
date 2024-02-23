package KodeTesting.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class WaterType {
    private List<Pokemon> waterTypePokemon;

    public WaterType() {
        waterTypePokemon = new ArrayList<>();
    }

    public void addWaterType(Pokemon pokemon) {
        waterTypePokemon.add(pokemon);
    }
}
