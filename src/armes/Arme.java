package armes;

public abstract class Arme {
    private final String nom;
    private final int degats;
    private final int portee;

    public Arme(String nom, int degats, int portee) {
        this.nom = nom;
        this.degats = degats;
        this.portee = portee;
    }

    public String getNom() {
        return this.nom;
    }

    public int getDegats() {
        return this.degats;
    }
}
