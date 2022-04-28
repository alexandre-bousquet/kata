package Base;

public class Pokemon {
    private String nom;
    private int poids;
    private int taille;

    public Pokemon(String nom, int poids, int taille) {
        super();
        this.nom = nom;
        this.poids = poids;
        this.taille = taille;
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