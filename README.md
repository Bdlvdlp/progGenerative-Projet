# Projet PG-IDM 2025/26 - Génération de code Java

Génération de code Java à partir d'un modèle de processus LDP en utilisant EMF/Ecore et Acceleo.

## Ce qui fonctionne

### Partie 1 : Séquence simple

- Méta-modèle LDP étendu avec les 3 types d'actions : InitVariable, InstantiationObjet, AppelMethode
- Modèle XMI de l'exemple demandé : calcul de (n!)^puiss / x avec n=6, puiss=3, x=100
- Génération de code Java compilable et fonctionnel via le template Acceleo
- Le code généré utilise les classes utilitaires Calcul.java et Logger.java fournies

### Partie 2 : Séquences parallèles

- Méta-modèle étendu avec Fourche et Jonction (héritent de ElementProcessus)
- Modèle XMI d'exemple avec 2 branches parallèles (square et factorial)
- Génération de threads Java pour les séquences parallèles (lambda + Thread)
- Synchronisation via join() à la jonction
- Gestion de la portée des variables entre threads (tableaux à 1 élément)
- Code généré compilable et fonctionnel, testé avec succès
- Template Acceleo rétrocompatible : les modèles sans fourche/jonction (séquence simple) continuent de générer du code correct

## Ce qui ne fonctionne pas

- Rien à signaler, les deux parties sont fonctionnelles

## Structure du projet

- `Projet/metamodels/LDP.ecore` — Méta-modèle Ecore
- `Projet/model/CalculFactoriel.xmi` — Modèle séquence simple
- `Projet/model/ExempleParallele.xmi` — Modèle séquences parallèles
- `acceleo.LDP/src/acceleo/LDP/common/generateLDP.mtl` — Générateur Acceleo
- `Projet/src/Calcul.java` — Classe utilitaire de calcul
- `Projet/src/Logger.java` — Classe utilitaire d'affichage
