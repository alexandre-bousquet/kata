# Zombie Surviror

```ignorelang
TODO : 
- A modifier pour le rendre plus intéressant et ajouter des éléments.
- Ajouter la gestion des zombies (vie, attaques ...), tours du jeu et système de ciblage.
```

Ce kata construit un modèle pour les survivants d'un jeu de société zombie. Complétez chaque étape avant de passer à la 
suivante. Révisez votre conception pour réagir aux nouvelles exigences telles qu'elles apparaissent. Ce kata est adapté 
de celui trouvé sur ce dépôt [Git](https://github.com/ardalis/kata-catalog).

## Première étape : les survivants

L'apocalypse zombie s'est produite. Vous devez modéliser un survivant dans ce monde difficile. Parfois, ils se blessent 
et meurent même.
- Chaque survivant a un nom.
- Chaque survivant commence avec 0 blessure.
- Un survivant qui reçoit 2 blessures meurt immédiatement ; les blessures supplémentaires sont ignorées.
- Chaque survivant commence avec la possibilité d'effectuer 3 actions par tour.

## Deuxième étape : l'équipement

Les survivants peuvent utiliser du matériel pour les aider dans leur mission.
- Chaque survivant peut transporter jusqu'à 5 pièces d'équipement.
- Jusqu'à 2 pièces d'Équipement transportées sont "en main" ; les autres sont "en réserve". 
(Exemples d'équipement : "Batte de baseball", "Poêle à frire", "Katana", "Pistolet", "Eau en bouteille", "Molotov")
- Chaque blessure subie par un survivant réduit de 1 le nombre d'équipements qu'il peut porter.
- Si le survivant a plus d'équipement que sa nouvelle capacité, choisissez une pièce à défausser 
(à implémenter comme vous le souhaitez).

## Troisième étape : le jeu

Un jeu comprend un ou plusieurs survivants, ainsi que d'autres éléments du jeu qui ne sont pas couverts par ce kata.

- Une partie commence avec 0 survivant.
- Un jeu peut avoir des survivants ajoutés à tout moment.
- Les noms de survivants dans un jeu doivent être uniques.
- Une partie se termine immédiatement si tous ses survivants sont morts.

## Quatrième étape : Expérience et niveaux

Au fur et à mesure que les survivants surmontent les zombies, ils acquièrent de l'expérience.
- Chaque Survivant commence avec 0 expérience.
- Chaque survivant a un niveau actuel.
- Chaque survivant commence au niveau bleu.
- Chaque fois que le survivant tue un zombie, il peut gagner 1 expérience.
- Les niveaux consistent en (dans l'ordre): Bleu, Jaune, Orange, Rouge.
  - Lorsqu'un survivant dépasse 6 points d'expérience, il passe ("niveau supérieur") au niveau jaune. 
  - Lorsqu'un survivant dépasse 18 points d'expérience, il passe au niveau orange. 
  - Lorsqu'un survivant dépasse 42 points d'expérience, il passe au niveau rouge.
- Un jeu a un niveau (le niveau ici est identique au niveau d'un survivant).
- Une partie commence au niveau bleu.
- Le niveau de jeu est toujours égal au niveau du survivant en vie le plus élevé.

## Cinquième étape : sortie

Le jeu comprend un historique des événements qui se sont déroulés au fur et à mesure qu'il a été joué. 
La gestion de l'historique du jeu est une responsabilité du jeu.
- L'historique du jeu commence par l'enregistrement de l'heure à laquelle le jeu a commencé.
- L'historique du jeu indique qu'un survivant a été ajouté au jeu.
- L'histoire du jeu indique qu'un survivant acquiert une pièce d'équipement.
- L'histoire du jeu indique note qu'un survivant est blessé.
- L'histoire du jeu note qu'un survivant meurt.
- L'histoire du jeu indique qu'un survivant monte de niveau.
- L'historique du jeu indique que le niveau du jeu change.
- L'histoire du jeu note que le jeu s'est terminé lorsque le dernier survivant meurt.

## Sixième étape : Avancement

Au fur et à mesure que le jeu avance, les survivants s'améliorent.
- Un ensemble de compétences potentielles et les niveaux où elles sont déverrouillées s'appelle un arbre de compétences.
- Chaque survivant commence par un arbre de compétences.
  - Un arbre de compétences se compose de compétences potentielles et de compétences déverrouillées.
  - Un arbre de compétences commence avec 1 compétence potentielle au niveau Jaune, 2 à Orange et 3 à Rouge.
  - Tous les Arbres de Compétences ont la même compétence Jaune : "+1 Action".
  - Chaque survivant peut avoir un arbre de compétences qui lui est propre.
- Lorsqu'un survivant passe pour la première fois à un niveau particulier, il peut débloquer une compétence disponible 
à partir de ce niveau.
  - Au niveau Jaune, seule la compétence "+1 Action" devrait être disponible, elle sera donc déverrouillée.
- Un Survivant qui a "+1 Action" devrait avoir une Action supplémentaire (un total de 4).
- Compétences supplémentaires : "+1 dé (distance)", "+1 dé (mêlée)", "+1 action de mouvement libre", "Magot", "Snipeur", "Robuste".
  - Un Survivant qui a débloqué la compétence "Magot" peut transporter une pièce d'Équipement supplémentaire.
- Lorsqu'un survivant dépasse 43 points d'expérience, il reste au niveau rouge mais recommence une deuxième fois dans 
l'arbre de compétences.
  - En atteignant à nouveau Jaune (43 + 7 = 50 au total), plus aucune compétence potentielle n'est disponible.
  - En atteignant à nouveau Orange (43 + 18 = 61 au total), une deuxième compétence Orange est débloquée.
  - En atteignant à nouveau Rouge (43 + 43 = 86 au total), une deuxième compétence Rouge est déverrouillée.
- Un Survivant peut redémarrer une deuxième fois, déverrouillant sa dernière compétence Rouge à (43 + 43 + 43 = 129 au
total) d'expérience.
- L'historique du jeu indique qu'un survivant a acquis une nouvelle compétence.

## Remarques

Comment avez-vous modélisé l'interaction entre les survivants et le jeu ? Les survivants ont-ils un accès 
direct au jeu auquel ils jouent ? Si oui, le code dans les méthodes d'un survivant peut-il modifier 
directement l'état des autres survivants dans le même jeu ? Est-ce un problème potentiel ?


Comment avez-vous modélisé l'historique du jeu ? Avez-vous veillé à ce que la responsabilité du suivi de 
l'historique soit une préoccupation du jeu, et non des survivants individuels ?