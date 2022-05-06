# Game of life

_Sujet adapté d'un exercice trouvé sur [codingdojo.org](http://codingdojo.org/)._

Ce Kata consiste à calculer les prochaines générations d'un game of life quelle que soit la position de départ.
Ce concept d'automatisme cellulaire a été inventé par John Horton Conway (voir page [wikipédia](http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) 
pour le contexte).

Vous commencez avec une grille à taille variable de cellules à deux dimensions, où chaque cellule est soit 
vivante, soit morte. Dans cette version du problème, la grille est finie et aucune vie ne peut exister en 
dehors des bords. Lors du calcul de la génération suivante de la grille, suivez ces règles :

1. Toute cellule vivante avec moins de deux voisins vivants meurt, comme si elle était causée par une sous-population.
2. Toute cellule vivante avec plus de trois voisins vivants meurt, comme si elle était surpeuplée.
3. Toute cellule vivante avec deux ou trois voisins vivants survit à la génération suivante.
4. Toute cellule morte avec exactement trois voisins vivants devient une cellule vivante.

## Aides

La position de départ de l'entrée peut être une grille qui ressemble à ceci :

```ignorelang
Generation 1 :
........
....*...
...**...
........
```

Et la sortie des générations suivantes pourrait ressembler à ceci :

```ignorelang
Generation 2 :
........
...**...
...**...
........
```

## Travail à faire
Vous devez écrire un programme qui peut accepter une grille arbitraire de taille variable de cellules et 
qui produira des grilles similaires montrant les générations suivantes.
