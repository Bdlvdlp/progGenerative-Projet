# Projet PG-IDM 2025/26 - Génération de code Java

Génération de code Java à partir d'un modèle de processus LDP en utilisant EMF/Ecore et Acceleo.

## Ce qui fonctionne

### Partie 1 : Séquence simple

- Méta-modèle LDP étendu avec les 3 types d'actions : InitVariable, InstantiationObjet, AppelMethode
- Modèle XMI de l'exemple demandé : calcul de (n!)^puiss / x avec n=6, puiss=3, x=100
- Génération de code Java compilable et fonctionnel via le template Acceleo
- Le code généré utilise les classes utilitaires Calcul.java et Logger.java fournies

## Ce qui ne fonctionne pas

### Partie 2 : Séquences parallèles

- Fork/Join non implémentés dans le méta-modèle
- Pas de génération de threads Java ni de synchronisation
