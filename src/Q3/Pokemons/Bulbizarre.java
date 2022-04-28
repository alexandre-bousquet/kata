package Q3.Pokemons;

public class Bulbizarre extends Pokemon {
    public Bulbizarre(int poids, int taille) {
        super("Bulbizarre", poids, taille);
    }

    @Override
    public void evoluer() {
        if (this.getTaille() > 1) {
            this.augmenterTaille(-1);
            this.augmenterPoids(8);
        } else {
            this.setPoids(0);
            this.setTaille(0);
        }
    }
}
