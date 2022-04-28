package Q3.Pokemons;

public class Salameche extends Pokemon {
    public Salameche(int poids, int taille) {
        super("Salameche", poids, taille);
    }

    @Override
    public void evoluer() {
        this.augmenterPoids(1);
    }
}
