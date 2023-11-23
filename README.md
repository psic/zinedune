# Zinedune

Encore une tentative de faire une simulation de foot...la 3, 4 ou 5ème.
On vise la simulation avec match en temps réels
Pour ça il nous faut :
+ Avoir un moteur de calcul de match
+ Avoir un moteur de rendu de match
+ Avoir des attributs de joueurs
+ Avoir un schéma de BDD et une BDD
+ Avoir un générateur d'équipes, de joueurs, de ligue, de journées, de championnats
+ Avoir un site web

## État d'avancement

+ Moteur de Calcul : 3%
+ Moteur de Rendu : 1%
+ Site Web Front : 0%
+ Site Web Back : 0%
+ BDD : 5%

## Moteur de Calcul de Match

Produit un fichier de match au format JSON ou autre stockant les déplacements (et autres actions) des joueurs et du ballon pendant un match de 90 minutes

Temps de jeu effectif : entre 50% et 60% du temps de jeu réel
Pour 45 min -> 2700 secondes

### Le Terrain

Un rectangle de 36 x 18 cases.
Divisé en 12 zones

### Tactique

Une tactique est :

+ la liste de positions des joueurs d'une équipe en position offensive (avec le ballon) pour chacune des zones de terrain (position possible du ballon) : 11 joueurs x 12 positions tactique offensives
+ la liste de positions des joueurs d'une équipe en position defensives (sans le ballon) pour chacune des zones de terrain (position possible du ballon) : 11 joueurs x 12 positions tactique defensives

On fournira des tactiques pré-définies.

### Les Actions

+ Passe*
+ Contrôle
+ Course lente / moyenne / rapide
+ Tir*
+ (Centre?)
+ Drible
+ Tackle
+ Trackle glissé
+ Décision

## Moteur de rendu de Match

Lit un fichier match et en fait une représentation 2D

## Attributs de joueurs

### Spatiale

Un joueur n'a pas de poste pré-défini (CB, LB, MDC, ST, ...). Il a des habilités à jouer dans certaines zones du terrain.

+ Capacité à jouer à gauche
+ Capacité à jouer à droite
+ Capacité à jouer au centre
+ Capacité à joueur devant
+ Capacité à joueur derrière
+ Capacité à jouer au mileu

### Footbalistique

+ Technique**
+ Tactique**
+ Force*
+ Physique*
+ Vitesse*

### Mental

+ Expérience
+ Mental
+ (Talent ?)
+ Potentiel (progression possible pour les attributs *)

## BDD

Certainement MariaDB

### Schéma

### Générer des données

Y'a du script, surement du Python

## Site Web

### Front

Surement flutter pour avoir Web/Android/iOS dans le même build

### Back

À déterminer
