// TODO : Solution à faire

public class Population2 {
    private Pokemon[] elements;

    public Population2(Pokemon[] elements) {
        this.elements = elements;
    }

    public Population2() {
        this.elements = new Pokemon[]{
				new Pokemon("Pikachu", 10, 20),
                new Pokemon("Salameche", 8, 8),
                new Pokemon("Rondoudou", 4, 7),
                new Pokemon("Bulbizarre", 20, 80),
                new Pokemon("Rhinoferos", 15, 20),
                new Pokemon("Polimorfe", 3, 6)
        };
    }

    public void evolution() {
        for (Pokemon p : this.elements) {
            if (p.getNom().equals("Pikachu") && p.getPoids() < 400) {
                this.augmenterTaille(p, 2);
                this.augmenterPoids(p, 3);
            }
            if (p.getNom().equals("Polimorfe") || p.getNom().equals("Salameche")) {
                this.augmenterPoids(p, 1);
            }
            if (p.getNom().equals("Polimorfe") || p.getNom().equals("Rondoudou")) {
                this.augmenterTaille(p, 4);
            }
            if (p.getNom().equals("Bulbizarre")) {
                if (p.getTaille() > 1) {
                    this.augmenterTaille(p, -1);
                    this.augmenterPoids(p, 8);
                } else {
                    p.setPoids(0);
                    p.setTaille(0);
                }
            }
        }
    }

    private void augmenterTaille(Pokemon p, int number) {
        if (p.getTaille() < 100 || p.getPoids() <= 350) {
            if (p.getTaille() > 100 - number) {
                p.setTaille(100);
            } else {
                p.setTaille(p.getTaille() + number);
            }
        } else {
            p.setTaille(p.getTaille() + 1);
        }
    }

    private void augmenterPoids(Pokemon p, int number) {
        if (p.getPoids() < 50) {
            p.setPoids(p.getPoids() + number);
        } else if (p.getPoids() > 100) {
            p.setPoids(p.getPoids() + (number * 4));
        } else {
            p.setPoids(p.getPoids() + (number * 2));
        }
    }

    public String toString() {
        String s = new String();
        for (Pokemon p : this.elements)
            s += p.getNom() + " " + p.getPoids() + " " + p.getTaille() + "\n";
        return s;
    }
}	