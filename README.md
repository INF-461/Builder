PROJET INF461 - DESIGN PATTERN BUILDER
Auteur : OYOKI

DESCRIPTION
Le patron Builder permet de construire des objets complexes
en plusieurs etapes.

EXEMPLE
Fabrication de deux pizzas :
- Pizza Reine
- Pizza Piquante

PARTICIPANTS
- Produit : Pizza
- Monteur abstrait : MonteurPizza
- Monteurs concrets : MonteurPizzaReine et MonteurPizzaPiquante
- Directeur : Directeur
- Client : Client

STRUCTURE
Cours : implementation de reference inspiree du support.
Modifie : implementation avec directeur parametrable.

COMPILATION
javac -encoding UTF-8 -d out example/model/*.java

EXECUTION
java -cp out example.model.Client

Les sources sont fournies dans les dossiers Cours et Modifié.
