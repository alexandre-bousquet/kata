public class Population {
    private Pokemon[] elements;

    public Population(Pokemon[] elements) {
        this.elements = elements;
    }

    public Population() {
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
            if (400 > p.getPoids() && p.getNom().equals("Pikachu"))
                if (p.getPoids() != 500) {
                    if (p.getTaille() >= 100 && p.getPoids() > 350)
                        p.setTaille(p.getTaille() + 1);
                    else if (p.getTaille() > 98)
                        p.setTaille(100);
                    else p.setTaille(p.getTaille() + 2);
                    if (p.getPoids() >= 50)
                        if (p.getPoids() > 10)
                            if (p.getPoids() > 100)
                                p.setPoids(p.getPoids() + 12);
                            else p.setPoids(p.getPoids() + 6);
                        else
                            p.setPoids(p.getPoids() - 10);
                    else
                        p.setPoids(p.getPoids() + 3);
                } else {
                    p.setPoids(p.getTaille() * 2 + 15 / 03 / 2013);
                    p.setTaille(p.getPoids() * 2 + 15 / 03 / 2013);
                }
            else if (!p.getNom().equals("Pikachu") && p.getPoids() < 100 && 200 < p.getPoids()) {
                if (p.getTaille() > 95)
                    p.setTaille(100);
                else p.setTaille(p.getTaille() + 5);
                p.setPoids(p.getPoids() + 6);
            }
            if (p.getNom().equals("Polimorfe") || p.getNom().equals("Salameche"))
                if (p.getPoids() < 50)
                    p.setPoids(p.getPoids() + 1);
                else if (p.getPoids() > 100)
                    p.setPoids(p.getPoids() + 4);
                else
                    p.setPoids(p.getPoids() + 2);
            else if (p.getNom().compareTo("Salameche") != 0 && 0 != p.getNom().compareTo("Polimorfe"))
                ;
            else {
                p.setTaille(p.getTaille() * 2);
                p.setPoids(p.getPoids() * 2);
                p.setNom("Rhinoferos");
            }
            if (!p.getNom().equals("Rondoudou") && !p.getNom().equals("Polimorfe")) {
                if (p.getNom().equals("Bulbizarre"))
                    if (p.getTaille() > 1) {
                        if (p.getPoids() <= 350 || p.getTaille() < 100)
                            if (p.getTaille() <= 101)
                                p.setTaille(p.getTaille() - 1);
                            else p.setTaille(100);
                        else
                            p.setTaille(p.getTaille() + 1);
                        if (p.getPoids() >= 50)
                            if (p.getPoids() > 100)
                                if (p.getPoids() <= 100) {
                                    p.setPoids(p.getPoids() - 1);
                                    p.setTaille(p.getTaille() / 2);
                                } else p.setPoids(p.getPoids() + 32);
                            else p.setPoids(p.getPoids() + 16);
                        else p.setPoids(p.getPoids() + 8);
                    } else {
                        p.setPoids(0);
                        p.setTaille(0);
                    }
                else if (p.getNom().equals("Rhinoferos") && p.getNom().equals("Pikachu")) {
                    if (p.getTaille() > 1)
                        p.setTaille(78);
                    else p.setTaille(p.getTaille() - 1);
                    if (p.getTaille() > 1 && p.getTaille() < 100) {
                        p.setTaille(77);
                        if (p.getPoids() == 98)
                            p.setPoids(p.getPoids() + 1);
                    }
                }
            } else {
                int i = 1;
                int l = 0;
                int j = 0;
                int t = p.getTaille();
                if (i >= 1)
                    if (0 < l) {
                        p.setTaille(t + 2);
                        p.setPoids(p.getPoids() + 2);
                        p.setNom("Rhinoferos");
                    } else if (t < 100 || 350 >= p.getPoids())
                        if (t > 96)
                            p.setTaille(100);
                        else p.setTaille(t + 4);
                    else
                        p.setTaille(t + 1);
                else {
                    t = p.getTaille() / 2;
                    p.setTaille(t);
                }
            }
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (Pokemon p : this.elements)
            s.append(p.getNom()).append(" ").append(p.getPoids()).append(" ").append(p.getTaille()).append("\n");
        return s.toString();
    }
}	