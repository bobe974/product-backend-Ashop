# Utiliser une image de base avec Java
FROM openjdk:17-jdk-slim

# Copier le fichier JAR de l'application dans l'image
COPY  product-backend-0.0.1-SNAPSHOT.jar /app/product-backend-0.0.1-SNAPSHOT.jar

# Définir le répertoire de travail dans l'image
WORKDIR /app

# Exposer le port sur lequel l'application s'exécute
EXPOSE 3000

# Commande pour démarrer l'application Spring Boot lorsque le conteneur est lancé
CMD ["java", "-jar", "product-backend-0.0.1-SNAPSHOT.jar"]
