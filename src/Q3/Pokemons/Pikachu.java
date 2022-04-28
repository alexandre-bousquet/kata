package Q3.Pokemons;

public class Pikachu extends Pokemon {
    public Pikachu(int poids, int taille) {
        super("Pikachu", poids, taille);
    }

    @Override
    public void evoluer() {
        if (this.getPoids() < 400) {
            this.augmenterTaille(2);
            this.augmenterPoids(3);
        }
    }
}
