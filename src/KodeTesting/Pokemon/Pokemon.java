package KodeTesting.Pokemon;

public class Pokemon {
    private String name;
    private String type;
    private String number;
    private Boolean evolution;

    public Pokemon(String name, String type, String number, Boolean evolution) {
        this.name = name;
        this.type = type;
        this.number = number;
        this.evolution = evolution;
    }

    void pokemonCall() {
        System.out.println("Dette er " + this.name + " og det er en " + this.type + " pokemon");
        System.out.println("Pokemon nummer: " + this.number);
        System.out.println("Kan den utvikle seg? " + this.evolution);
        System.out.println();
    }
}
