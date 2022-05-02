# RPG Combat

Il s'agit d'un kata amusant dans lequel le programmeur construit des règles de combat simples, comme 
pour un jeu de rôle (RPG). Il est implémenté comme une séquence d'itérations. Le domaine n'inclut pas 
de carte ni aucune autre compétence de personnage en dehors de leur capacité à s'endommager et à se 
soigner mutuellement. Il est adapté du kata trouvé sur ce dépôt [Git](https://github.com/ardalis/kata-catalog).

Complétez chaque itération avant de lire la suivante.

## Première itération
1) Tous les personnages, une fois créés, ont :
   - Santé, à partir de 1000
   - Niveau, à partir de 1
   - Peut être vivant ou mort, commençant vivant (vivant peut être un vrai/faux)
2) Les personnages peuvent infliger des dégâts aux personnages. 
   - Les dégâts sont soustraits de la santé
   - Lorsque les dégâts reçus dépassent la santé actuelle, la santé devient 0 et le personnage meurt
3) Un personnage peut soigner un personnage. 
   - Les personnages morts ne peuvent pas être soignés
   - La guérison ne peut pas augmenter la santé au-dessus de 1000

## Deuxième itération
1) Un personnage ne peut pas s'infliger de dégâts.
2) Un personnage peut se soigner que lui-même.
3) Lorsque vous infligez des dégâts :
   - Si la cible est de 5 niveaux ou plus au-dessus de l'attaquant, les dégâts sont réduits de 50%
   - Si la cible est à 5 niveaux ou plus en dessous de l'attaquant, les dégâts sont augmentés de 50%

## Troisième itération
1) Les personnages ont une portée maximale d'attaque.
2) Les combattants de mêlée ont une portée de 2 mètres.
3) Les combattants à distance ont une portée de 20 mètres.
4) Les personnages doivent être à portée pour infliger des dégâts à une cible.

## Rétrospective
- Respectez-vous les exigences ? 
- Une itération a-t-elle été un grand défi ?
- Vous sentez-vous bien dans votre conception ? Est-elle évolutive et facilement adaptable aux 
nouvelles exigences ?
- Est-ce que tout est testé ?
- Êtes-vous sûr de votre code ?

## Quatrième itération
1) Les personnages peuvent appartenir à une ou plusieurs factions.
2) Les personnages nouvellement créés n'appartiennent à aucune faction.
3) Un personnage peut rejoindre ou quitter une ou plusieurs factions.
4) Les joueurs appartenant à la même Faction sont considérés comme des Alliés.
5) Les alliés ne peuvent pas s'infliger de dégâts.
6) Les alliés peuvent se soigner mutuellement.

## Cinquième itération
1) Les personnages peuvent endommager des choses qui ne sont pas des personnages (accessoires). 
   - Tout ce qui a de la santé peut être une cible 
   - Ces choses ne peuvent pas être guéries et elles n'infligent pas de dégâts 
   - Ces choses n'appartiennent pas aux Factions ; elles sont neutres 
   - Lorsqu'il est réduit à 0 Santé, les choses sont détruites (par exemple, vous pouvez créer un 
   arbre avec 2000 points de vie)

## Rétrospective
- Quels problèmes avez-vous rencontrés ?
- Qu'as-tu appris ? Une nouvelle technique ou un nouveau modèle ?