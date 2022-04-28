package Q3.Pokemons;

public abstract class Pokemon {
    private String nom;
    private int poids;
    private int taille;

    public Pokemon(String nom, int poids, int taille) {
        super();
        this.nom = nom;
        this.poids = poids;
        this.taille = taille;
    }

    public abstract void evoluer();

    public void augmenterTaille(int number) {
        if (this.getTaille() < 100 || this.getPoids() <= 350) {
            if (this.getTaille() > 100 - number) {
                this.setTaille(100);
            } else {
                this.setTaille(this.getTaille() + number);
            }
        } else {
            this.setTaille(this.getTaille() + 1);
        }
    }

    public void augmenterPoids(int number) {
        if (this.getPoids() < 50) {
            this.setPoids(this.getPoids() + number);
        } else if (this.getPoids() > 100) {
            this.setPoids(this.getPoids() + (number * 4));
        } else {
            this.setPoids(this.getPoids() + (number * 2));
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
