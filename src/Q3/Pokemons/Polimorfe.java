package Q3.Pokemons;

public class Polimorfe extends Pokemon {
    public Polimorfe(int poids, int taille) {
        super("Polimorfe", poids, taille);
    }

    @Override
    public void evoluer() {
        this.augmenterPoids(1);
        this.augmenterTaille(4);
    }
}
