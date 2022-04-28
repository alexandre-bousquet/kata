package Q3;

import Q3.Pokemons.*;

public class FabriquePokemon {
    private static FabriquePokemon instance;

    private FabriquePokemon() {
    }

    public static FabriquePokemon getInstance() {
        if (instance == null) {
            instance = new FabriquePokemon();
        }
        return instance;
    }

    public Pokemon genererPokemon(String nom, int poids, int taille) {
        switch (nom) {
            case "Pikachu":
                return new Pikachu(poids, taille);
            case "Salameche":
                return new Salameche(poids, taille);
            case "Rondoudou":
                return new Rondoudou(poids, taille);
            case "Bulbizarre":
                return new Bulbizarre(poids, taille);
            case "Rhinoferos":
                return new Rhinoferos(poids, taille);
            case "Polimorfe":
                return new Polimorfe(poids, taille);
            default:
                return null;
        }
    }
}
