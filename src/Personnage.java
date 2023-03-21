public abstract class Personnage {
    private final String nom;
    private int vie;
    private int niveau;
    private boolean vivant;
    protected int portee;

    public Personnage(String nom) {
        this.nom = nom;
        this.vie = 1000;
        this.niveau = 1;
        this.vivant = true;
    }

    public void attaquer(double degats, Personnage adversaire) {
        if (adversaire.vivant) {
            double degatsReel = degats;
            if (this != adversaire) {
                if (this.niveau + 5 <= adversaire.niveau) {
                    degatsReel = degats / 2;
                } else if (this.niveau >= adversaire.niveau + 5) {
                    degatsReel = degats * 1.5;
                }

                adversaire.vie -= degatsReel;
                System.out.println(this.nom + " attaque " + adversaire.nom + " et lui inflige " + degatsReel + " points de dégâts.");

                if (adversaire.vie <= 0) {
                    adversaire.vivant = false;
                    System.out.println(adversaire.nom + " est mort.");
                }
            } else {
                System.out.println(this.nom + " ne peut pas s'attaquer lui-même.");
            }
        } else {
            System.out.println("Impossible d'attaquer un adversaire mort.");
        }
    }

    public void soigner(int soin, Personnage personnage) {
        if (personnage.vivant) {
            if (this == personnage) {
                if (personnage.vie + soin <= 1000) {
                    personnage.vie += soin;
                    System.out.println(personnage.nom + " se soigne de " + soin + " points de vie.");
                }
            } else {
                System.out.println(this.nom + " ne peut pas soigner " + personnage.nom + ".");
            }
        } else {
            System.out.println("Impossible de soigner un personnage mort.");
        }
    }

    public void gagnerNiveau() {
        this.niveau++;
        System.out.println(this.nom + " passe au niveau " + this.niveau + ".");
    }

    public void gagnerPlusieursNiveaux(int niveaux) {
        for (int i = 0; i < niveaux; i++) {
            this.gagnerNiveau();
        }
    }

    public void afficherInfos() {
        System.out.println();
        System.out.println("Statistiques de " + this.nom + " :");
        System.out.println("- Vie : " + this.vie);
        System.out.println("- Niveau : " + this.niveau);
        System.out.println("- Vivant : " + this.vivant);
        System.out.println("- Portée : " + this.portee);
        System.out.println();
    }
}
