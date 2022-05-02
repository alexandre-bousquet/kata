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

    /**
     * If the size of the object is less than 100 or the weight is less than 350, then if the size of the object is greater
     * than 100 minus the number, then set the size of the object to 100, otherwise set the size of the object to the size
     * of the object plus the number. Otherwise, set the size of the object to the size of the object plus 1.
     *
     * @param number the number of centimeters to add to the height of the Pokemon.
     */
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

    /**
     * If the weight is less than 50, increase it by the number passed in. If the weight is greater than 100, increase it
     * by 4 times the number passed in. Otherwise, increase it by 2 times the number passed in.
     *
     * @param number the number of pounds to add to the weight of the Pokemon.
     */
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
