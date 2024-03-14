Authors: [OURZIK Jugurta]() - [MIEL Nils]()

# Compte rendu 
#### Est-ce que toutes les relations bidirectionnelles sont importantes ? Pourquoi ?

La relation bidirectionnelle entre **Client**  et **Commande** est intéressante car on imagine dans l'interface, un client doit avoir accès à l'historique 
de ses commandes et on suppose qu'une commande a besoin de l'adresse du clientalors il est intéressant d'avoir cette 
relation bidirectionnelle.

Cependant la relation entre **Produit** et **Categorie** semble moins intéressante car si un client peut rechercher des produits en commençant par les filtrer par catégorie 
, l'inverse et lui beaucoup moins fréquent, un client ne va généralement pas chercher la catégorie d'un produit qu'il a trouvé.


Par ailleurs elles comptent quelques inconvénients car leur utilisation dépend du contexte de l'application et du besoin 
à savoir :
  - le chargement excessif de données.
  - Maintenabilité difficile du code.
  - Boucles infinies si mal paramétrées.








#### *REMARQUE*:
Le schéma UML semble avoir une erreur au niveau des cardinalités qui sont inversées pour une relation similaire.


