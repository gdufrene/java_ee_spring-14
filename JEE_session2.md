![Université Lille 1](http://www.univ-lille1.fr/digitalAssets/38/38040_logo-trans.png)

# IFI - Projet JEE 

__Session de rattrapage master e-services FA__


En France on dénombre 170000 associations sportives pour 14 millions de pratiquants.
Sur base de ce constat nous souhaitons mettre en oeuvre une application permettant d'animer des communautés sportives à l'échelle régionale sous la forme de coupe sportive ou de challenge annuel. Notre application se veut généraliste mais sera déclinée par activité au besoin.

Notre application prendra la forme d'un site internet sur lequel les membres viendront s'inscrire.
Les membres déclarerons leur affiliation à l'une des associations. Un responsable associatif validera cette affiliation.
Une fois inscrit et validé, le membre pourra venir renseigner une performance réalisée.
Nous considérerons une performance comme un nombre de point permettant d'émettre un classement général.
Les points renseignés peuvent être liés au classement d'une compétition ou à une performance ponctuelle.

## <i class="icon-list"></i> Liste des fonctionnalités.

<i class="icon-tag"></i> *En tant que sportif, je souhaite m'inscrire sur le site afin de renseigner mes performances et évaluer mon niveau dans ma région.*

Pour s'inscrire un membre devra renseigner obligatoirement son nom, prénom, email, date de naissance, club affilié.
On supposera que les clubs sont déjà renseignés dans la base de données (par exemple par un import de la liste d'une fédération).
Lorsqu'un membre s'inscrit, sa demande est soumise à validation, on l'invite à attendre confirmation de cette inscription.

<i class="icon-tag"></i> *En tant que membre sportif je suis notifié de la validation de mon inscription et je peux m'identifier.*

Après qu'un référent ait valider mon inscription je reçoit un mail avec un mot de passe généré automatiquement.
Le mot de passe contient au moins 8 caractères, possède une majuscule, un symbole et un chiffre placé aléatoirement dans le mot de passe.
Je peux alors m'identifier à l'aide de mon mail et de mon mot de passe.

<i class="icon-tag"></i> *En tant que membre, je peux saisir une performance.*

Je renseigne la date de la performance, le nombre de point, le type de performance.
Si il s'agit d'une "compétition", je suis invité à choisir parmi les compétitions déjà renseignées, ou à en saisir une nouvelle (un simple libellé).
Il devrait être possible d'ajouter une compétition sans avoir à quitter l'écran de saisi de la performance.

<i class="icon-tag"></i> *En tant que visiteur du site, je peux consulter le classement des meilleures performances*

Affichage d'un classement établi selon LA meilleure performance individuel de chacun des membres inscrits.
Le classement est régional, en fonction du lieu déclaré pour l'association pour laquelle le membre est affilié.

<i class="icon-tag"></i> *En tant que visiteur du site, je peux consulter le classement par compétition.*

Affichage d'un classement établi selon la performance à l'une des compétition et par région.
Les compétitions n'étant pas nécessairement régionales, il faudra donc trier les membres en fonction
de l'affiliation club de chacun.


<i class="icon-tag"></i> *En tant que membre référent d'une association je valide une inscription afin de permettre au membre de rentrer sur le site.*

Une liste des membres en attente de validation est présenté, trié par date décroissante de demande d'inscription au site.
Je peux visualiser les informations renseignées par un membre et je peux décider de valider son inscription.
Je peux refuser l'inscription de ce membre et laisser un commentaire.
Un membre dont l'inscription a été refusé apparaîtra en gris dans la liste des demandes d'inscription.
Je peux toujours décider plus tard de valider son inscription.

<i class="icon-tag"></i> *En tant qu'admin, je peux assigner un membre référent à une association.*

Je choisis une association parmi une liste triée par nom.
La liste des membres affiliés à cette association apparait triée par nom. Le référent actuel, si il existe, est mis en évidence (par exemple en bleu).
Je peux sélectionner un nouveau référent pour cette association.
Il ne peut y avoir qu'un seul référent par association.


<i class="icon-tag"></i> *En tant qu'admin j'ai une vue globale des demandes en attente de validation.*

Une liste me présente toute les demandes en attente de validation (pas celles qui sont validées, ni refusées)
Je peux, à la place du référent de l'association, valider ou refuser l'inscription d'un membre.
(voir scénario référent/validation)


## <i class="icon-login"></i> Livrable.

<i class="icon-user"></i> Le projet est individuel. 
<i class="icon-calendar"></i> Il est à rendre pour le 12 JUIN 2015 AVANT 22h00.
<i class="icon-folder-open"></i> Une archive (zip ou tar.gz) contenant les sources d'un projet maven et vos ressources web (vues, images, styles, scripts ...)

Les dépendances mavens ne seront pas fournies, elles doivent pouvoir être récupérées en utilisant "mvn compile".
Votre projet utilisera spring, sera organisé selon un pattern MVC mettant en oeuvre des vues en JSP.
Les contrôleurs seront configurés à l'aide des annotations spring vues en cours/tp cette année.
Les informations seront persistées à travers des objets définis avec les annotation JPA dans une base de données relationnelles.
Au choix : MySQL, postgres ou H2 database.
Dans tous les cas des indications claires seront données pour initialiser la base de données si nécessaire.
Votre archive doit pouvoir être utilisée comme une application compatible JEE dans tomcat 8.

Votre application devrait pouvoir se lancer en faisant :

 - une extraction de votre archive dans le répertoire "webapp", 
 - une compilation ,
 - initialiser la base de données si nécessaire (par exemple à l'aide d'un script SQL) ,
 - une copie éventuelle des dépendances dans WEB-INF/lib (à documenter) ,
 - lancer Tomcat 8

