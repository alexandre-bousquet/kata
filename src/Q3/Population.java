package Q3;

import Q3.Pokemons.*;

public class Population {
    private final Pokemon[] elements;

    public Population(Pokemon[] elements) {
        this.elements = elements;
    }

    public Population() {
        FabriquePokemon fabrique = FabriquePokemon.getInstance();
        this.elements = new Pokemon[] {
                fabrique.genererPokemon("Pikachu", 10, 20),
                fabrique.genererPokemon("Salameche", 8, 8),
                fabrique.genererPokemon("Rondoudou", 4, 7),
                fabrique.genererPokemon("Bulbizarre", 20, 80),
                fabrique.genererPokemon("Rhinoferos", 15, 20),
                fabrique.genererPokemon("Polimorfe", 3, 6)
        };
    }

    public void evolution() {
        for (Pokemon p : this.elements) {
            p.evoluer();
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (Pokemon p : this.elements)
            s.append(p.getNom()).append(" ").append(p.getPoids()).append(" ").append(p.getTaille()).append("\n");
        return s.toString();
    }
}	