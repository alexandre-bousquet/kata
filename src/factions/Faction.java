package factions;

import personnages.Personnage;

import java.util.ArrayList;
import java.util.List;

public class Faction {
    private final String nom;
    private List<Personnage> membres;

    public Faction(String nom) {
        this.nom = nom;
        this.membres = new ArrayList<>();
    }

    public void ajouterMembre(Personnage personnage) {
        if (!this.membres.contains(personnage)) {
            this.membres.add(personnage);
            System.out.println(personnage.getNom() + " rejoint la faction " + this.nom + ".");
        } else {
            System.out.println(personnage.getNom() + " fait déjà partie de la faction " + this.nom + ".");
        }
    }

    public void supprimerMembre(Personnage personnage) {
        if (this.membres.contains(personnage)) {
            this.membres.remove(personnage);
            System.out.println(personnage.getNom() + " quitte la faction " + this.nom + ".");
        } else {
            System.out.println(personnage.getNom() + " ne fait pas partie de la faction " + this.nom + ".");
        }
    }

    public String getNom() {
        return this.nom;
    }

    public void afficherMembres() {
        System.out.println("Membres de la faction " + this.nom + " :");
        for (Personnage personnage : this.membres) {
            System.out.println("- " + personnage.getNom());
        }
    }
}
