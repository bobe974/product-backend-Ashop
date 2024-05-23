# Product-backend-Api

Product-backend-Api est un back-end permettant la gestion de produits avec Spring Boot.

## Prérequis

Avant de commencer, assurez-vous d'avoir les éléments suivants installés sur votre système :

- Docker
- Java

## Configuration

1. Ouvrez une console dans le répertoire ressources 
2. Lancez la commande suivante pour démarrer la base de données PostgreSQL avec Docker :
   ```docker-compose up -d```
3. Lancez l'application Spring Boot en utilisant votre IDE ou la commande Maven suivante :
      ```mvn spring-boot:run```

## Utilisation de l'API

Vous pouvez utiliser Postman pour interroger l'API. Voici les endpoints disponibles :

- GET /api/products : Récupérer la liste des produits.
- GET /api/products/{id} : Récupérer un produit par son ID.
- POST /api/products : Ajouter un nouveau produit.
- PUT /api/products/{id} : Mettre à jour un produit existant.
- DELETE /api/products/{id} : Supprimer un produit.


