package Q3;

import Q3.Pokemons.*;

public class Population {
    private Pokemon[] elements;

    public Population(Pokemon[] elements) {
        this.elements = elements;
    }

    public Population() {
        this.elements = new Pokemon[] {
				new Pikachu(10, 20),
                new Salameche(8, 8),
                new Rondoudou(4, 7),
                new Bulbizarre(20, 80),
                new Rhinoferos(15, 20),
                new Polimorfe(3, 6)
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