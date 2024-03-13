author: [Jugurta]()
## Exercice 2

#### Pourquoi le choix de la stratégie d'hériatge "TABLE_PER_CLASS" ?
Rappel: une stratégie d'héritage est une option de mapping d'objets relationnels
utilisée pour mapper les hiérarchies d'héritage dans une base de données relationnelle.

Mon choix pour cette stratégie **TABLE_PER_CLASS** dépend des facteurs suivants:

    - Performances au niveau du requêtage: En évitant les jointures entres les tables quand le schéma d'héritage est complexe.

    - Évolutivité de l'application: Comme on dispose d'une table par classe, cela nous donnerait une flexibilité 
      pour rajouter d'autres attributs à chaque classe.

    - Un schéma en base de données très clair: on sait quelle table on manipule et quelles données y sont associées.

    - Dans certains cas lorsqu'on est sûr que notre classe mère n'est pas instanciable (abstraite), cette stratégie est plus facile à utliser.

