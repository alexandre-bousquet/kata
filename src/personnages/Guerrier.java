package personnages;

import armes.Epee;

public class Guerrier extends Personnage {
    public Guerrier(String nom) {
        super(nom, 100, new Epee());
    }
}
