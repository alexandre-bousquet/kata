package Q3;

import Q3.Pokemons.*;

/**
 * It's a concrete factory with a singleton that returns a Pokemon object based on the name of the Pokemon.
 */
public class FabriquePokemon {
    private static FabriquePokemon instance;

    private FabriquePokemon() {
    }

    /**
     * If the instance is null, create a new instance of the class. Otherwise, return the existing instance.
     *
     * @return The instance of the class.
     */
    public static FabriquePokemon getInstance() {
        if (instance == null) {
            instance = new FabriquePokemon();
        }
        return instance;
    }

    /**
     * It returns a Pokemon object of the type specified by the name parameter.
     *
     * @param nom the name of the Pokemon you want to generate.
     * @param poids the weight of the Pokemon.
     * @param taille the height of the Pokemon.
     * @return A Pokemon object.
     */
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
