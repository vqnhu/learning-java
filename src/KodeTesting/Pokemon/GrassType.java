package KodeTesting.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class GrassType {

    private List<Pokemon> grassTypePokemon;

    public GrassType() {
        grassTypePokemon = new ArrayList<>();
    }

    public void addGrassType(Pokemon pokemon) {
        grassTypePokemon.add(pokemon);
    }

    public void listGrassType() {
        for (Pokemon pokemon : grassTypePokemon) {
            pokemon.pokemonCall();
        }
    }

}
