package personnages;

import armes.Arme;
import factions.Faction;

public abstract class Personnage {
    private final String nom;
    private int vie;
    private int niveau;
    private int armure;
    private boolean vivant;
    private Faction faction;
    private Arme arme;

    public Personnage(String nom) {
        this.nom = nom;
        this.vie = 1000;
        this.armure = 50;
        this.niveau = 1;
        this.vivant = true;
    }

    public Personnage(String nom, Arme arme) {
        this(nom);
        this.arme = arme;
    }

    public Personnage(String nom, int armure, Arme arme) {
        this(nom, arme);
        this.armure = armure;
    }

    public void attaquer(Personnage adversaire) {
        if (adversaire.vivant) {
            if (this != adversaire) {
                if (this.arme != null) {
                    if (this.faction == null || this.faction != adversaire.faction) {
                        double degats = Math.round(this.arme.getDegats() * this.niveau * (adversaire.armure / (adversaire.armure + 100.0)));
                        if (degats < 0) {
                            degats = 0;
                        }
                        if (this.niveau + 5 <= adversaire.niveau) {
                            degats = degats / 2;
                        } else if (this.niveau >= adversaire.niveau + 5) {
                            degats = degats * 1.5;
                        }

                        adversaire.vie -= degats;
                        System.out.println(this.nom + " attaque " + adversaire.nom + " et lui inflige " + degats + " points de dégâts.");

                        if (adversaire.vie <= 0) {
                            adversaire.vivant = false;
                            System.out.println(adversaire.nom + " est mort.");
                        }
                    } else {
                        System.out.println(this.nom + " et " + adversaire.nom + " font partie de la même faction.");
                    }
                } else {
                    System.out.println(this.nom + " n'a pas d'arme.");
                }
            } else {
                System.out.println(this.nom + " ne peut pas s'attaquer lui-même.");
            }
        } else {
            System.out.println("Impossible d'attaquer un adversaire mort.");
        }
    }

    public void soigner(int soin, Personnage cible) {
        if (this.vivant) {
            if (cible.vivant) {
                if ((this.faction != null && this.faction == cible.faction) || this == cible) {
                    if (cible.vie + soin <= 1000) {
                        cible.vie += soin;
                        System.out.println(this.nom + " soigne " + cible.nom + " de " + soin + " points de vie.");
                    }
                } else {
                    System.out.println(this.nom + " et " + cible.nom + " ne font pas partie de la même faction.");
                }
            } else {
                System.out.println("Impossible de soigner un personnage mort.");
            }
        } else {
            System.out.println("Impossible de soigner en étant mort.");
        }
    }

    public void soigner(int soin) {
        this.soigner(soin, this);
    }

    public void gagnerNiveau() {
        this.niveau++;
        this.armure += 10;
        System.out.println(this.nom + " passe au niveau " + this.niveau + ".");
        this.soigner(500);
    }

    public void rejoindreFaction(Faction faction) {
        if (this.faction == null) {
            this.faction = faction;
            faction.ajouterMembre(this);
        } else {
            System.out.println(this.nom + " fait déjà partie de la faction " + this.faction.getNom() + ".");
        }
    }

    public void quitterFaction(Faction faction) {
        if (this.faction == faction) {
            this.faction = null;
            faction.supprimerMembre(this);
        } else {
            System.out.println(this.nom + " ne fait pas partie de la faction " + faction.getNom() + ".");
        }
    }

    public void afficherInfos() {
        System.out.println("Statistiques de " + this.nom + " :");
        System.out.println("- Vie : " + this.vie);
        System.out.println("- Niveau : " + this.niveau);
        System.out.println("- Vivant : " + this.vivant);
        System.out.println("- Arme : " + this.arme.getNom());
    }

    public String getNom() {
        return this.nom;
    }

    public boolean estVivant() {
        return this.vivant;
    }
}
