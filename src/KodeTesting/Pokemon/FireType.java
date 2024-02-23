package KodeTesting.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class FireType {
    private List<Pokemon> fireTypePokemon;

    public FireType() {
        fireTypePokemon = new ArrayList<>();
    }

    public void addFireType(Pokemon pokemon) {
        fireTypePokemon.add(pokemon);
    }
}

