import combat.Combat;
import factions.Faction;
import personnages.Archer;
import personnages.Guerrier;
import personnages.Personnage;

public class Application {
    public static void main(String[] args) {
        // Création de factions
        Faction legion = new Faction("Legion");
        Faction apex = new Faction("Apex");

        // Création de personnages
        Personnage nolann = new Guerrier("Nolann");
        Personnage alex = new Archer("Alex");
        Personnage jules = new Archer("Jules");

        // Ajout des personnages dans les factions
        nolann.rejoindreFaction(legion);
        nolann.rejoindreFaction(legion); // Nolann est déjà dans la faction Legion
        alex.rejoindreFaction(apex);

        // Combat entre les personnages
        Combat combat = new Combat(nolann, alex);
        combat.lancer();
        Combat combat2 = new Combat(jules, alex);
        combat2.lancer();

        // Affichage d'informations sur les personnages
        nolann.afficherInfos();
        alex.afficherInfos();
    }
}
