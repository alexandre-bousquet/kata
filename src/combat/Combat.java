package combat;

import personnages.Personnage;

public class Combat {
    private final Personnage participant1;
    private final Personnage participant2;

    public Combat(Personnage participant1, Personnage participant2) {
        this.participant1 = participant1;
        this.participant2 = participant2;
    }

    public void lancer() {
        System.out.println("Le combat entre " + this.participant1.getNom() + " et " + this.participant2.getNom() + " commence !");

        while (this.participant1.estVivant() && this.participant2.estVivant()) {
            this.participant1.attaquer(this.participant2);
            if (this.participant2.estVivant()) {
                this.participant2.attaquer(this.participant1);
            }
        }

        Personnage vainqueur = this.participant1.estVivant() ? this.participant1 : this.participant2;
        System.out.println("Le combat est terminé ! " + vainqueur.getNom() + " remporte la victoire !");
        vainqueur.gagnerNiveau();
    }
}
