package personnages;

import armes.Arc;

public class Archer extends Personnage {
    public Archer(String nom) {
        super(nom, 50, new Arc());
    }
}
