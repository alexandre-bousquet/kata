public class App {
    public static void main(String[] args) {
        Melee nolann = new Melee("Nolann");
        Distance alex = new Distance("Alex");

        nolann.attaquer(100, alex);
        nolann.gagnerPlusieursNiveaux(5);

        nolann.attaquer(100, alex);
        alex.soigner(100, alex);
        alex.afficherInfos();
    }
}
