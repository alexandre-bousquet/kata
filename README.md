# RPG Combat

Il s'agit d'un kata amusant dans lequel le programmeur construit des règles de combat simples, comme 
pour un jeu de rôle (RPG). Il est implémenté comme une séquence d'itérations. Le domaine n'inclut pas 
de carte ni aucune autre compétence de personnage en dehors de leur capacité à s'endommager et à se 
soigner mutuellement. Il est adapté du kata trouvé sur ce dépôt [Git](https://github.com/ardalis/kata-catalog).

Complétez chaque itération avant de lire la suivante.

## Informations
La classe Application montre le résultat qu'on veut obtenir à la fin. Jouez dans le main afin de tester votre code petit à petit.
Pensez a faire des affichages réguliers dans les méthodes afin d'avoir un retour visuel sur le déroulement du programme.

Exemple : `System.out.println("Le personnage 1 attaque le personnage 2");` ou `System.out.println("Le personnage 1 a rejoint la faction Apex");`

## Première itération
1) Tous les Personnage, une fois créés, ont comme caractéristiques :
   - Nom (paramètre de construction)
   - Santé, à partir de 1000
   - Niveau, à partir de 1
   - Armure, à partir de 50
   - Il peut être vivant ou mort, commençant vivant (vivant peut être un vrai/faux)
   - Une arme, attribut typé Arme (voir ci-dessous)
2) Les Arme ont comme caractéristiques :
   - Nom (paramètre de construction)
   - Dégâts (paramètre de construction)
   - Portée (paramètre de construction)
3) Les Personnage peuvent infliger des dégâts aux Personnage. 
   - Les dégâts sont soustraits de la santé
   - Lorsque les dégâts reçus dépassent la santé actuelle, la santé devient 0 et le Personnage meurt
4) Un Personnage peut soigner un Personnage. 
   - Les personnages morts ne peuvent pas être soignés
   - La guérison ne peut pas augmenter la santé au-dessus de 1000

## Deuxième itération
1) Un Personnage ne peut pas s'infliger de dégâts.
2) Un Personnage peut se soigner que lui-même.
3) Un Personnage ne peut pas se soigner s'il est mort.
4) Lorsque vous infligez des dégâts :
   - Les dégâts réels infligés arrondis dépendent du niveau du Personnage, son arme et de l'armure de l'adversaire selon la formule suivante :
   `Math.round(this.arme.getDegats() * this.niveau * (adversaire.armure / (adversaire.armure + 100.0)));`
   - Si la cible est de 5 niveaux ou plus au-dessus de l'attaquant, les dégâts sont réduits de 50%
   - Si la cible est à 5 niveaux ou plus en dessous de l'attaquant, les dégâts sont augmentés de 50%

## Troisième itération
1) Il n'existe pas de Personnage pur (voir classes abstraites).
2) Il existe deux types de Personnage : les Guerrier et les Archer (voir héritage).
3) Les Guerrier ont une arme par défaut : Epee (nom : Épée, dégâts : 200, portée : 1).
4) Les Guerrier ont 100 points d'armure par défaut.
5) Les Archer ont une arme par défaut : Arc (nom : Arc, dégâts : 150, portée : 3).
6) Les Archer ont 50 points d'armure par défaut.

## Rétrospective
- Respectez-vous les exigences ? 
- Une itération a-t-elle été un grand défi ?
- Vous sentez-vous bien dans votre conception ? Est-elle évolutive et facilement adaptable aux 
nouvelles exigences ?
- Est-ce que tout est testé ?
- Êtes-vous sûr de votre code ?

## Quatrième itération
1) Les Personnage peuvent appartenir à une faction.
2) Les Faction ont comme caractéristiques :
   - Nom (paramètre de construction)
   - Liste des membres (initialisée à vide)
3) Les Personnage nouvellement créés n'appartiennent à aucune faction.
4) Un Personnage peut rejoindre ou quitter une faction.
5) Les Personnage appartenant à la même faction sont considérés comme des alliés.
6) Les alliés ne peuvent pas s'infliger de dégâts.
7) Les alliés peuvent se soigner mutuellement.

## Cinquième itération
1) Des combats ont lieu entre deux Personnage et ont comme caractéristiques :
   - Personnage 1 (paramètre de construction)
   - Personnage 2 (paramètre de construction)
2) Les combats ont une méthode "Lancer" qui fait s'affronter les deux Personnage. Tant que les deux Personnage sont vivants, ils s'attaquent l'un l'autre. Le combat se termine lorsque l'un des deux personnages meurt.
3) Le gagnant du combat gagne un niveau.
4) Gagner un niveau se traduit par un soin de 500 points de santé et une augmentation de l'armure de 10 points.

## Sixième itération
1) Les Personnage peuvent endommager des choses qui ne sont pas des Personnage (accessoires). 
   - Tout ce qui a de la santé peut être une cible 
   - Ces choses ne peuvent pas être guéries et elles n'infligent pas de dégâts 
   - Ces choses n'appartiennent pas aux Factions ; elles sont neutres 
   - Lorsqu'il est réduit à 0 Santé, les choses sont détruites (par exemple, vous pouvez créer un 
   arbre avec 2000 points de vie)

## Rétrospective
- Quels problèmes avez-vous rencontrés ?
- Qu'as-tu appris ? Une nouvelle technique ou un nouveau modèle ?