package Q3.Pokemons;

public class Rondoudou extends Pokemon {
    public Rondoudou(int poids, int taille) {
        super("Rondoudou", poids, taille);
    }

    @Override
    public void evoluer() {
        this.augmenterTaille(4);
    }
}
