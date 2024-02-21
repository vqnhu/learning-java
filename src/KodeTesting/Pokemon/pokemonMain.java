package KodeTesting.Pokemon;

public class pokemonMain {

    public static void main(String[] args) {

        GrassType grassGroup = new GrassType();
        FireType fireGroup = new FireType();
        WaterType waterGroup = new WaterType();

        Pokemon bulbasar = new Pokemon("Bulbasar", "gress", "#0001", true);
        Pokemon caterpie = new Pokemon("Caterpie", "gress", "#0010", true);


        grassGroup.addGrassType(bulbasar);
        grassGroup.addGrassType(caterpie);

        Pokemon charmander = new Pokemon("Charmander", "flamme", "#0004", true);
        Pokemon magmar = new Pokemon("Magmar", "flamme", "#0126", false);

        fireGroup.addFireType(charmander);
        fireGroup.addFireType(magmar);

        Pokemon squirtle = new Pokemon("Squirtle", "vann", "#0007", true);
        Pokemon tentacool = new Pokemon("Tentacool", "vann", "#0072", true);

        waterGroup.addWaterType(squirtle);
        waterGroup.addWaterType(tentacool);

//        grassGroup.listGrassType();
//        fireGroup.listFireType();
//        waterGroup.listWaterType();

        squirtle.pokemonCall();


    }

}
